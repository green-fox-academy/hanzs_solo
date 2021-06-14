package com.gfa.conectionwithmysql.controllers;

import com.gfa.conectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
