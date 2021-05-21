package com.gfa.firsttry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping(path = "/main", method = RequestMethod.GET)
  public String displayMessage(){
    return "welcome";
  }

//  @ResponseBody
//  @RequestMapping
//  public String redirect(){
//    return
//  }

}
//// @RestController --> A special controller that has a (hidden) @ResponseBody over all endpoints
//@Controller
//public class MainController {
//
//  // Endpoint
//  // @ResponseBody -> return what the method returns
//  // No @ResponseBody -> return the template with the given name
//  @RequestMapping(path = "/main", method = RequestMethod.GET)
//  // alternative --> @GetMapping(path = "/main")
//  public String displayMessage(Model model) {
//    model.addAttribute("userName", "Riel");
//    return "welcome";
//  }
//
//  @RequestMapping(path = "/form", method = RequestMethod.GET)
//  public String displayForm() {
//    return "my-form";
//  }
//
//  @ResponseBody
//  // alternative --> @PostMapping(path = "/data")
//  @RequestMapping(path = "/data", method = RequestMethod.POST)
//  public String displayFormData(String data1, int data2) {
//    return xy(data1, data2);
//  }
//
//  private String xy(String data1, int data2) {
//    return "Ezt küldted vala: " + data1 + " and " + data2;
//  }
//}