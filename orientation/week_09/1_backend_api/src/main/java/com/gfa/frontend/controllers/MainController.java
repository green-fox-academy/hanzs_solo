package com.gfa.frontend.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gfa.frontend.models.appenda.AppendA;
import com.gfa.frontend.models.arrayhandler.ArraysIncoming;
import com.gfa.frontend.models.arrayhandler.ResultAsArray;
import com.gfa.frontend.models.arrayhandler.ResultAsNumber;
import com.gfa.frontend.models.dountil.DoUntil;
import com.gfa.frontend.models.doubling.Doubling;
import com.gfa.frontend.models.Error;
import com.gfa.frontend.models.dountil.UntilIncoming;
import com.gfa.frontend.models.greeter.Someone;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String showIndex() {
    return "index";
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doDoubling(@RequestParam(required = false) Integer input) {

    if (input == null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new Error("Please provide an input!"));
    } else {
      System.out.println(ResponseEntity.status(HttpStatus.OK).body(new Doubling(input)));
      return ResponseEntity.status(HttpStatus.OK).body(new Doubling(input));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> doGreeting(
      @RequestParam(required = false) String name,
      @RequestParam(required = false) String title) {

    if (name == null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a title!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Someone(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appendA(@PathVariable(required = false) String appendable) {

    if (appendable == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(
      @PathVariable String action,
      @RequestBody(required = false) UntilIncoming untilIncoming) {

    if (untilIncoming.getUntil() == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide a number!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new DoUntil(action, untilIncoming.getUntil()));
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity<?> handleArrays(
      @RequestBody(required = false)ArraysIncoming arraysIncoming) {

    if (arraysIncoming.getWhat() == null || arraysIncoming.getNumbers() == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new Error("Please provide what to do with the numbers!"));
    }else {


      if(arraysIncoming.getWhat().equals("sum") || arraysIncoming.getWhat().equals("multiply")){
        return ResponseEntity.status(HttpStatus.OK)
            .body(new ResultAsNumber(arraysIncoming));
      }else {
        return ResponseEntity.status(HttpStatus.OK)
            .body(new ResultAsArray(arraysIncoming));
      }
    }
  }
}
