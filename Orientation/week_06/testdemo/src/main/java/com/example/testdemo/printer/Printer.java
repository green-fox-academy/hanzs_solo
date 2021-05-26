package com.example.testdemo.printer;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class Printer {
  public void log(String message) {
    System.out.println(
        "// SOME SPRING INFO\n"
        + LocalDateTime.now() + " MY PRINTER SAYS --- " + message
        + "\n// SOME SPRING INFO"
    );
  }
}