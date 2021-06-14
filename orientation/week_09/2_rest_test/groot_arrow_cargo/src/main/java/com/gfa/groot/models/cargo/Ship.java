package com.gfa.groot.models.cargo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Ship {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  @JsonProperty("shipstatus")
  private String shipStatus;
  private boolean ready;

  public Ship() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    calculateShipStatusAndSetReady();
  }

  private void calculateShipStatusAndSetReady(){
    double ammoSum = caliber25 + caliber30 + caliber50;
    double maxAmmo = 12500;

    if(ammoSum == maxAmmo){
      shipStatus = "full";
      ready = true;
    }else if (ammoSum <= 0){
        shipStatus = "empty";
        ready = false;
    }else if(ammoSum > maxAmmo){
      shipStatus = "overloaded";
      ready = false;
    }else {
      shipStatus = ((int)(ammoSum/maxAmmo*100)) + "%";
      ready = false;
    }
  }

  public void addCaliber25(Integer amount){
    caliber25 += amount;
    calculateShipStatusAndSetReady();
  }

  public void addCaliber30(Integer amount){
    caliber30 += amount;
    calculateShipStatusAndSetReady();
  }

  public void addCaliber50(Integer amount){
    caliber50 += amount;
    calculateShipStatusAndSetReady();
  }
}
