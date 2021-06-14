package com.gfa.groot.controllers;

import com.gfa.groot.models.ErrorDTO;
import com.gfa.groot.models.YondusArrowDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YondusArrowController {


  @GetMapping("/yondu")
  public ResponseEntity<?> calculateSpeed(
      @RequestParam(required = false) Double distance,
      @RequestParam(required = false) Double time) {
    if (distance == null || time == null) {
      return ResponseEntity.badRequest().body(new ErrorDTO("Send me all data"));
    }else if(time == 0){
      return ResponseEntity.badRequest().body(new ErrorDTO("Zero time? Really?"));
    }
    else {
      return ResponseEntity.ok().body(new YondusArrowDTO(distance, time));
    }
  }
}
