package com.gfa.webshop.controllers;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import com.gfa.webshop.services.AdminService;
import com.gfa.webshop.services.CustomerService;
import com.gfa.webshop.services.DataService;
import com.gfa.webshop.services.LogService;
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

  private final WebshopService webshopService;
  private final LogService logService;
  private final DataService dataService;

  private final CustomerService customerService;

  @Autowired
  public WebshopController(WebshopService webshopService,
      DataService dataService,
      CustomerService customerService,
      LogService logService) {
    this.webshopService = webshopService;
    this.customerService = customerService;
    this.dataService = dataService;
    this.logService = logService;
  }

  @GetMapping("/")
  public String main() {
    return "redirect:/webshop";
  }

  @GetMapping("/webshop")
  public String webshop(Model model) {
    model.addAttribute("items", dataService.getItemsFiltered());
    model.addAttribute("wallet", dataService.getBalance());
    model.addAttribute("lastFilterQuery", dataService.getLastFilterQuery());
    return "index";
  }

  @GetMapping("/reset-filters")
  public String resetFilters(@RequestParam String redirectPath) {
    webshopService.resetFiltersService();
    dataService.setLastFilterQuery(dataService.getDefaultFilterQuery());
    return "redirect:/" + redirectPath;
  }

  @GetMapping("/filter-results")
  public String sort(HttpServletRequest request,
      FilterQueryHolder filterQueryHolder,
      @RequestParam String redirectPath) {

    System.out.println(filterQueryHolder);
    logService.log(request, "filtering results");

    webshopService.filterService(filterQueryHolder);
    dataService.setLastFilterQuery(filterQueryHolder);

    return "redirect:/" + redirectPath;
  }

  @GetMapping("/buy/{index}")
  public String buy(@PathVariable int index) {
    customerService.buyService(index);
    return "redirect:/webshop";
  }

}
