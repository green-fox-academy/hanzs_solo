package com.gfa.groot.controllers;


import com.gfa.groot.models.ErrorDTO;
import com.gfa.groot.models.GrootDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> doIntroduction(@RequestParam(required = false) String message) {
    if (message == null || message.equals("")) {
      return ResponseEntity.badRequest().body(new ErrorDTO("I am Groot!"));
    } else {
      return ResponseEntity.ok().body(new GrootDTO(message));
    }

  }

}
