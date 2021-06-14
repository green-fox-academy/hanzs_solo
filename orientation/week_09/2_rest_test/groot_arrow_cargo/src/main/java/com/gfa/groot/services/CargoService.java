package com.gfa.groot.services;

import com.gfa.groot.models.ErrorDTO;
import com.gfa.groot.models.cargo.FillResponseDTO;
import com.gfa.groot.models.cargo.Ship;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

  Ship ship = new Ship();

  public Ship returnShip() {
    return ship;
  }

  public FillResponseDTO fillShipAndReturnFillResponseDTO(String caliber, Integer amount) {
    switch (caliber) {
      case ".25":
        ship.addCaliber25(amount);
        break;
      case ".30":
        ship.addCaliber30(amount);
        break;
      case ".50":
        ship.addCaliber50(amount);
        break;
    }
    return new FillResponseDTO(ship, caliber, amount);
  }

  public ErrorDTO validateFillShip(String caliber, Integer amount) {
    List<String> acceptableCalibers = new ArrayList<>(Arrays.asList(".25", ".30", ".50"));
    if (caliber == null || amount == null) {
      return new ErrorDTO("you have to provide both data");
    }
    if (amount <= 0) {
      return new ErrorDTO("you have to fill ship with a positive amount of ammo");
    }
    if (!acceptableCalibers.contains(caliber)) {
      return new ErrorDTO("caliber not supported");
    }
    return null;
  }
}