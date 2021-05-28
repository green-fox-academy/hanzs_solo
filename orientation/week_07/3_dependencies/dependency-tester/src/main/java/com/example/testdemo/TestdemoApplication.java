package com.example.testdemo;

import com.example.testdemo.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestdemoApplication implements CommandLineRunner {

  private Printer printer;

  @Autowired
  TestdemoApplication(Printer printer){
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(TestdemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }
}
