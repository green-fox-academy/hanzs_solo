package com.gfa.listing_todos_with_h2.controllers;

import com.gfa.listing_todos_with_h2.models.Todo;
import com.gfa.listing_todos_with_h2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/todo")
public class TodoController {

  private final TodoRepository todoRepository;

  @Autowired
  TodoController (TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  @GetMapping("/")
  public String main(){
    return "redirect:/list";
  }

  @GetMapping("/list")
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
