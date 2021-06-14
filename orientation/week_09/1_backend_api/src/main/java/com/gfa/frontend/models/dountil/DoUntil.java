package com.gfa.frontend.models.dountil;

import lombok.Getter;

@Getter
public class DoUntil {

  Integer result;

  public DoUntil(String action, Integer until) {
    result = logic(action, until);
  }

  private Integer logic(String action, Integer until) {
    if (action.equals("sum")) {
      int r = 0;
      for (int i = 1; i <= until; i++) {
        r += i;
      }
      return r;
    } else if (action.equals("factor")) {
      int r = 1;
      for (int i = 1; i <= until; i++) {
        r = r * i;
      }
      return r;
    }
    return null;
  }
}
