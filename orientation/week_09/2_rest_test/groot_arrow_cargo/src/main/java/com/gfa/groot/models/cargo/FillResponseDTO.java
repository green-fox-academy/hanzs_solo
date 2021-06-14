package com.gfa.groot.models.cargo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class FillResponseDTO {

  private String recieved;
  private Integer amount;
  @JsonProperty("shipstatus")
  String shipStatus;
  boolean ready;

  public FillResponseDTO(Ship ship, String caliber, Integer amount) {
    recieved = caliber;
    this.amount = amount;
    shipStatus = ship.getShipStatus();
    ready = ship.isReady();
  }
}
