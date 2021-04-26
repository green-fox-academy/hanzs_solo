package Basics.week_04.Inheritance.GardenApplication;

//The Flower
//    needs water if its current water amount is less than 5
//    when watered the flower can only absorb 75% of the water
//    eg. watering with 10 the flower's amount of water should only increase by 7.5

//
//Class
//subclass of Plant
public class Flower extends Plant {
  //
  //constructors
  Flower(String color) {
    super(color);
    setPlantType("Flower");
    setMinWater(5);
    setAbsorbRatio(0.75);
  }
}
