package com.gfa.webshop.controllers;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.services.CustomerService;
import com.gfa.webshop.services.DataService;
import com.gfa.webshop.services.LogService;
import com.gfa.webshop.services.WebshopService;
import javax.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class WebshopController {

  private final WebshopService webshopService;
  private final LogService logService;
  private final DataService dataService;
  private final CustomerService customerService;

  @GetMapping("/")
  public String main() {
    return "redirect:/webshop";
  }

  @GetMapping("/webshop")

  public String displayWebShop(Model model) {
    model.addAttribute("items", dataService.getItemsFiltered());
    model.addAttribute("wallet", dataService.getBalance());
    model.addAttribute("lastFilterQuery", dataService.getLastFilterQuery());
    return "index";
  }

  @GetMapping("/reset-filters")
  public String resetFilters(@RequestParam String redirectPath) {
    webshopService.resetFilters();
    dataService.setLastFilterQuery(dataService.getDefaultFilterQuery());
    return "redirect:/" + redirectPath;
  }

  @GetMapping("/filter-results")
  public String filterItems(HttpServletRequest request,
      FilterQueryHolder filterQueryHolder,
      @RequestParam String redirectPath) {

    logService.log(request, "filtering results");
    webshopService.filterItems(filterQueryHolder);
    dataService.setLastFilterQuery(filterQueryHolder);

    return "redirect:/" + redirectPath;
  }

  @GetMapping("/buy/{index}")
  public String buy(@PathVariable int index) {
    customerService.buyItem(index);
    return "redirect:/webshop";
  }
}
