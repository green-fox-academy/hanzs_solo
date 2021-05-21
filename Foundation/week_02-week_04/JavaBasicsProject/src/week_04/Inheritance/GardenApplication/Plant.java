package week_04.Inheritance.GardenApplication;


//superclass
public class Plant {
  //
  //fields
  private String plantType;
  private String color;
  private int minWater;
  private double waterLevel;
  private boolean isThirsty;
  private double absorbRatio;


  //
  //constructors
  Plant(String color) {
    this.color = color;
    waterLevel = 0;
  }

  //
  //methods

  public void plantStatus() {
    checkThirst();
    if (isThirsty) {
      System.out.println("The " + color + " " + plantType + " needs water.");
    } else {
      System.out.println("The " + color + " " + plantType + " doesn't need water.");
    }
  }

  public void checkThirst() {
    isThirsty = waterLevel < minWater;
  }

  public void pourWater(double waterAmount) {
    waterLevel = waterLevel + waterAmount * absorbRatio;
  }

  //
  //getters and setters
  public void setPlantType(String plantType) {
    this.plantType = plantType;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setMinWater(int minWater) {
    this.minWater = minWater;
  }

  public void setAbsorbRatio(double absorbRatio) {
    this.absorbRatio = absorbRatio;
  }

  public boolean getIsThirsty() {
    return isThirsty;
  }
}