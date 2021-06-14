package com.gfa.reddit_project.controllers;

import com.gfa.reddit_project.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LandingPageController {

  private final PostService postService;

  @Autowired
  public LandingPageController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping({"/","/main/{username}"})
  public String showMainPage(Model model, @PathVariable String username) {
    model.addAttribute("posts", postService.getAllPosts());
    model.addAttribute("username", username);
    return "landing-page";
  }
}
