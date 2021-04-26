package Basics.week_04.Inheritance.GardenApplication;

//The Garden Application
//
//    The task is to create a garden application, so in your main method you should create a garden with flowers and trees.
//    The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange).
//    After creating these plants you should show the user how the garden looks like. After that the program should water the garden twice,
//    first with the amount of 40 then with 70. After every watering the user should see the state of the garden as you can see in the output below:

public class GardenApp {
  public static void main(String[] args) {

    Garden botanicalGarden = new Garden();

    botanicalGarden.addPlant(new Flower("yellow"));
    botanicalGarden.addPlant(new Flower("blue"));

    botanicalGarden.addPlant(new Tree("purple"));
    botanicalGarden.addPlant(new Tree("purple"));

    botanicalGarden.gardenStatus();
    System.out.println();

    botanicalGarden.waterThirstyPlants(40);
    botanicalGarden.gardenStatus();
    System.out.println();

    botanicalGarden.waterThirstyPlants(70);
    botanicalGarden.gardenStatus();
    System.out.println();
  }
}
