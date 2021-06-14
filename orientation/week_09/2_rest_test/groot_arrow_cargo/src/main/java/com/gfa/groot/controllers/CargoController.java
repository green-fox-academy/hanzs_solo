package com.gfa.groot.controllers;

import com.gfa.groot.models.ErrorDTO;
import com.gfa.groot.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CargoController {

  CargoService cargoService;

  @Autowired
  public CargoController(CargoService cargoService) {
    this.cargoService = cargoService;
  }

  @GetMapping("/rocket")
  public ResponseEntity<?> getShipStatus() {
    return ResponseEntity.ok().body(cargoService.returnShip());
  }

  @PostMapping("/rocket/fill")
  public ResponseEntity<?> fillShip(
      @RequestParam (required = false) String caliber,
      @RequestParam (required = false) Integer amount) {

    ErrorDTO error = cargoService.validateFillShip(caliber, amount);
    if (error == null) {
      return ResponseEntity.ok()
          .body(cargoService.fillShipAndReturnFillResponseDTO(caliber, amount));
    }
    return ResponseEntity.badRequest().body(error);
  }
}
