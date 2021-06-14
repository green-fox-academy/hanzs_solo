package com.gfa.frontend.models.doubling;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Doubling {

  Integer received;
  Integer result;

  public Doubling(Integer recieved) {
    this.received = recieved;
    result = recieved * 2;
  }
}
