package Basics.week_04.Inheritance.GardenApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * The Garden
 * is able to hold unlimited amount of flowers and trees
 * when watering it should only water those plants that need water with equally divided amount amongst them
 * eg. watering with 40 and 4 of them need water then each gets watered with 10
 */
public class Garden {
  //
  //fields
  List<Plant> plants = new ArrayList<>();

  //
  //methods
  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void gardenStatus() {
    for (Plant plant : plants) {
      plant.plantStatus();
    }
  }

  public void waterThirstyPlants(double waterAmount) {
    //distribute water
    waterAmount = waterAmount / getNumberOfThirstyPlants();
    //pour water on thirsty plants
    for (Plant plant : plants) {
      if (plant.getIsThirsty()) {
        plant.pourWater(waterAmount);
      }
    }
  }

  public int getNumberOfThirstyPlants() {
    int numberOfThirstyPlants = 0;
    for (Plant plant : plants) {
      plant.checkThirst();
      if (plant.getIsThirsty()) {
        numberOfThirstyPlants++;
      }
    }
    return numberOfThirstyPlants;
  }
}
