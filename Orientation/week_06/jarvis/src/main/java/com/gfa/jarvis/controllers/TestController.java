//package com.gfa.jarvis.controllers;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class TestController {
//  List<String> stringInput = new ArrayList<>();
//
//  @RequestMapping(name = "/test", method = RequestMethod.GET)
//  public String test() {
//    return "test";
//  }
//
//  @ResponseBody
//  @RequestMapping(value = "/posting", method = RequestMethod.POST)
//  public String getSomething(@RequestParam String data1, @RequestParam String data2) {
//    stringInput.add(data1);
//    stringInput.add(data2);
//    System.out.println(stringInput);
//    return "last input: " + stringInput.get(stringInput.size() - 2) + stringInput.get(stringInput.size() - 1);
//  }
//}
