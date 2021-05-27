package com.gfa.webshop.controllers;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import com.gfa.webshop.repositorys.WebshopRepository;
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
  FilterQueryHolder lastFilterQuery;

  @Autowired
  public WebshopController(WebshopService webshopService,
      WebshopRepository webshopRepository) {
    this.webshopService = webshopService;
    lastFilterQuery = new FilterQueryHolder("",null,"price",null,null);
  }

  @GetMapping("/")
  public String main() {
    return "redirect:/webshop";
  }

  @GetMapping("/webshop")
  public String filered(Model model) {

    model.addAttribute("items", webshopService.forwardItemsFiltered());
    model.addAttribute("wallet", webshopService.forwardBalance());
    model.addAttribute("lastFilterQuery", lastFilterQuery);
    return "index";
  }

  @GetMapping("/reset")
  public String resetFilters() {

    webshopService.resetFiltersService();
    return "redirect:/webshop";
  }


  @GetMapping("/sort")
  public String sort(HttpServletRequest request,
      FilterQueryHolder filterQueryHolder) {
    webshopService.log(request.getRemoteAddr() + " filtered items: " + filterQueryHolder);
    webshopService.filterLogic(filterQueryHolder);
    lastFilterQuery = filterQueryHolder;
    return "redirect:/webshop";
  }

  @GetMapping("/buy/{index}")
  public String buy(@PathVariable int index) {
    webshopService.buyService(index);
    return "redirect:/webshop";
  }


  @GetMapping("/adminmode")
  public String adminMode(Model model) {
    return "verify";
  }

  @GetMapping("/verify")
  public String verify(HttpServletRequest request,
      @RequestParam String password, Model model) {
    String redirectTo = webshopService.verifyPassService(request, password);
    model.addAttribute("items", webshopService.forwardItemsInitial());
    return redirectTo;
  }

  @PostMapping("/modify")
  public String modify(Item newItem, Model model) {
    webshopService.modifyService(newItem);
    model.addAttribute("items",webshopService.forwardItemsInitial());
    return "modify";
  }
}
