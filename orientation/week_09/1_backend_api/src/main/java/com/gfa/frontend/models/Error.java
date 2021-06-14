package com.gfa.frontend.models;

import lombok.Getter;

@Getter
public class Error {
  private String error;

  public Error(String error) {
    this.error = error;
  }

}
