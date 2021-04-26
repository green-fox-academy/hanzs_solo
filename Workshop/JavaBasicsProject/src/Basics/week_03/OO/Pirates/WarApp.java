package Basics.week_03.OO.Pirates;

import java.util.Random;

public class WarApp {
  //  Create a WarApp class with a main method
  //      Create 2 armadas, fill them with ships
  //  Have a war!

  public static void main(String[] args) {
    Armada fleetWoodenLegs = new Armada();
    Armada fleetBottleNecks = new Armada();

    imNotGonnaDoThisManually(fleetWoodenLegs);
    imNotGonnaDoThisManually(fleetBottleNecks);

    System.out.println("Woodenlegs fleet size: " + fleetWoodenLegs.getArmada().size());
    System.out.println("Bottlenecks fleet size: " + fleetBottleNecks.getArmada().size());
    System.out.println();

    fleetWoodenLegs.war(fleetBottleNecks);
  }

  private static void imNotGonnaDoThisManually(Armada armada) {
    Random random = new Random();
    int shipRecruits = random.nextInt(100) + 1;
    for (int i = 0; i < shipRecruits; i++) {
      armada.getArmada().add(new Ship());
      armada.getArmada().get(i).fillShip();
      System.out.println(i);
    }
  }
}
