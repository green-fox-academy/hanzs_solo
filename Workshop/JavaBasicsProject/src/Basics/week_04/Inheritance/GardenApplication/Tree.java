package Basics.week_04.Inheritance.GardenApplication;

/**
 * The Tree
 * needs water if its current water amount is less than 10
 * when watered the tree can only absorb the 40% of the water
 * eg. watering with 10 the tree's amount of water should only increase by 4
 */
//subclass of Plant
public class Tree extends Plant {
  //
  //constructors
  Tree(String color) {
    super(color);
    setPlantType("Tree");
    setMinWater(10);
    setAbsorbRatio(0.4);
  }
}
