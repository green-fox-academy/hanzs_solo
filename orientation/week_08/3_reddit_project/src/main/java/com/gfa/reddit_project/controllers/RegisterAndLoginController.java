package com.gfa.reddit_project.controllers;

import com.gfa.reddit_project.services.RegisterAndLoginService;
import java.util.OptionalLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterAndLoginController {

  private final RegisterAndLoginService registerAndLoginService;

  @Autowired
  public RegisterAndLoginController(
      RegisterAndLoginService registerAndLoginService) {
    this.registerAndLoginService = registerAndLoginService;
  }

  @GetMapping("/register")
  public String showRegisterPage() {
    return "register";
  }

  @PostMapping("/register")
  public String register(
      @RequestParam String username,
      @RequestParam String password) {

    if (registerAndLoginService.registerNewUser(username, password)) {
      return "redirect:/login";
    } else {
      return "redirect:/register";
    }
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String attemptLogin(
      @RequestParam String username,
      @RequestParam String password) {
    if (!registerAndLoginService.loginToAccount(username, password).equals("")) {
      return "redirect:/main/" + username;
    } else {
      return "redirect:/login";
    }
  }
}
