package com.gfa.groot.models;

import lombok.Getter;

@Getter
public class YondusArrowDTO {

  Double distance;
  Double time;
  Double speed;

  public YondusArrowDTO(Double distance, Double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }
}
