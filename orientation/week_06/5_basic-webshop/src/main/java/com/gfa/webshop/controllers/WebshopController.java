package com.gfa.webshop.controllers;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import com.gfa.webshop.services.WebshopService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebshopController {

  WebshopService webshopService;
  FilterQueryHolder defaultFilterQuery;
  FilterQueryHolder lastFilterQuery;
  Item itemAutoFill;

  @Autowired
  public WebshopController(WebshopService webshopService) {
    this.webshopService = webshopService;
    defaultFilterQuery = new FilterQueryHolder("", null, "price", null, null);
    lastFilterQuery = defaultFilterQuery;
    //itemAutoFill = webshopService.forwardEmptyItem();
  }

  @GetMapping("/")
  public String main() {
    return "redirect:/webshop";
  }

  @GetMapping("/webshop")
  public String webshop(Model model) {
    model.addAttribute("items", webshopService.forwardItemsFiltered());
    model.addAttribute("wallet", webshopService.forwardBalance());
    model.addAttribute("lastFilterQuery", lastFilterQuery);
    return "index";
  }

  @GetMapping("/reset-filters")
  public String resetFilters(@RequestParam String redirectPath) {
    webshopService.resetFiltersService();
    lastFilterQuery = defaultFilterQuery;
    return "redirect:/" + redirectPath;
  }

  @GetMapping("/filter-results")
  public String sort(HttpServletRequest request,
      FilterQueryHolder filterQueryHolder,
      @RequestParam String redirectPath) {

    webshopService.log(request.getRemoteAddr() + " filtered items: " + filterQueryHolder);
    webshopService.filterLogic(filterQueryHolder);

    lastFilterQuery = filterQueryHolder;

    return "redirect:/" + redirectPath;
  }

  @GetMapping("/buy/{index}")
  public String buy(@PathVariable int index) {
    webshopService.buyService(index);
    return "redirect:/webshop";
  }

  @GetMapping("/adminmodelogin")
  public String adminModeLogin(Model model) {
    return "admin-mode-login";
  }

  @GetMapping("/verify")
  public String verify(HttpServletRequest request,
      @RequestParam String password, Model model) {
    return webshopService.verifyPassService(request, password);
  }

  @GetMapping("/admin-mode")
  public String adminMode(Model model) {
    model.addAttribute("item", webshopService.forwardAutoFillItem());
    model.addAttribute("items", webshopService.forwardItemsFiltered());
    model.addAttribute("lastFilterQuery", lastFilterQuery);
    return "admin-mode";
  }

  @GetMapping("/remove")
  public String remove(@RequestParam Integer id) {
    webshopService.removeService(id);
    return "redirect:/admin-mode";
  }

  @PostMapping("/add")
  public String add(Item newItem) {
    webshopService.addService(newItem);
    return "redirect:/admin-mode";
  }

  @GetMapping("/autofill")
  public String autofill(@RequestParam Integer autoFillId) {
    System.out.println(autoFillId);
    webshopService.autoFillService(autoFillId);
    return "redirect:/admin-mode";
  }

  @PostMapping("/modify")
  public String modify(Item newItem) {
    webshopService.modifyService(newItem);
    itemAutoFill = newItem;
    return "redirect:/admin-mode";
  }

}
