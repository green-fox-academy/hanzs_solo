package com.gfa.frontend.models.greeter;

import lombok.Getter;

@Getter
public class Someone {
  private String welcome_message;

  public Someone(String name, String title) {
    welcome_message = "Oh, hi there "+name+", my dear "+title+"!";
  }
}
