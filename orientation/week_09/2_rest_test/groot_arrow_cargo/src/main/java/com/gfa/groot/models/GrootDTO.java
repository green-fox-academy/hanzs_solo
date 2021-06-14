package com.gfa.groot.models;

import lombok.Getter;

@Getter
public class GrootDTO {

  String received;
  String translated;

  public GrootDTO(String received) {
    this.received = received;
    translated = "I am " + received + "!";
  }
}
