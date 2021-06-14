package com.gfa.webshop.controllers;

import com.gfa.webshop.models.Item;
import com.gfa.webshop.services.AdminService;
import com.gfa.webshop.services.DataService;
import com.gfa.webshop.services.LogService;
import javax.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

  private final AdminService adminService;
  private final DataService dataService;
  private final LogService logService;


  @Autowired
  public AdminController(
      AdminService adminService,
      DataService dataService,
      LogService logService){
    this.adminService = adminService;
    this.dataService = dataService;
    this.logService = logService;
  }

  @GetMapping("/adminmodelogin")
  public String adminModeLogin(Model model) {
    return "admin-mode-login";
  }

  @GetMapping("/verify")
  public String verify(HttpServletRequest request,
      @RequestParam String password) {
    logService.log(request, "attempts to ACCESS ADMIN MODE with password: " + password);
    if (adminService.verifyAdminPass(password)) {
      logService.log(request, "    **ACCESS GRANTED**");
      return "redirect:/admin-mode";
    }else {
      logService.log(request, "    **ACCESS DENIED**");
      return "access-denied";
    }
  }

  @GetMapping("/admin-mode")
  public String adminMode(Model model) {
    model.addAttribute("item", dataService.getItemAutoFill());
    model.addAttribute("items", dataService.getItemsFiltered());
    model.addAttribute("lastFilterQuery", dataService.getLastFilterQuery());
    return "admin-mode";
  }

  @GetMapping("/remove")
  public String remove(HttpServletRequest request,
      @RequestParam Integer id) {

    logService.log(request, "wants to DELETE something from main list");
    if (adminService.removeItem(id)) {
      logService.log(request, "    **SUCCESS** item deleted");
    }
    return "redirect:/admin-mode";
  }

  @PostMapping("/add")
  public String add(HttpServletRequest request,
      Item newItem) {
    logService.log(request, "wants to ADD a new item to main list");
    adminService.addItem(newItem);
    logService.log(request, "    **SUCCESS** new item added");
    return "redirect:/admin-mode";
  }

  @GetMapping("/autofill")
  public String autofill(@RequestParam Integer id) {
    adminService.autoFillCurrentValues(id);
    return "redirect:/admin-mode";
  }

  @PostMapping("/modify")
  public String modify(HttpServletRequest request,
      Item newItem) {
    logService.log(request, "wants to MODIFY something in main list");
    if (adminService.modifyItem(newItem)) {
      logService.log(request, "    **SUCCESS** item modified");
    }
    return "redirect:/admin-mode";
  }
}
