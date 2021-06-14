package com.gfa.frontend.models.appenda;

import lombok.Getter;

@Getter
public class AppendA {
  private String appended;

  public AppendA(String appendable) {
    appended = appendable + "a";
  }
}
