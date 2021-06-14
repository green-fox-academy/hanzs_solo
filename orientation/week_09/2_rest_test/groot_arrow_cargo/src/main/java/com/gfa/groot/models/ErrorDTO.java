package com.gfa.groot.models;

import lombok.Getter;

@Getter
public class ErrorDTO {
  String error;

  public ErrorDTO(String error) {
    this.error = error;
  }
}
