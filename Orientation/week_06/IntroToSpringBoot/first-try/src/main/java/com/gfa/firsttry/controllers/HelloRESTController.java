package com.gfa.firsttry.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping(path = "/greeting", method = RequestMethod.GET)
  public Greeting greeting(@RequestParam(defaultValue = "anonymus", name = "fasz") int fasz,
                           @RequestParam(defaultValue = "5", name = "segg") int segg) {
    return new Greeting(atomicLong.incrementAndGet(), "fasz = " + fasz + " segg = " + segg);
  }

}
