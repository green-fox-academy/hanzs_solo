package com.gfa.reddit_project.controllers;

import com.gfa.reddit_project.services.PostService;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class PostController {

  private final PostService postService;
  AtomicLong nextFileName = new AtomicLong();

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/create/{username}")
  public String showCreatePostPage(
      Model model,
      @PathVariable String username) {
    model.addAttribute("username", username);
    return "create-post";
  }

  @PostMapping("/create/{username}")
  public String createPost(
      @PathVariable String username,
      @RequestParam String title,
      @RequestParam String content,
      @RequestParam MultipartFile file) {

    postService.saveNewPost(username, title, content, file);
    return "redirect:/main/" + username;
  }
}
