package week_03.OO.Pirates;

public class BattleApp {
  //  Create a BattleApp class with a main method
  //      Create 2 ships, fill them with pirates
  //  Have a battle!


  public static void main(String[] args) {
    Ship alice = new Ship();
    Ship maria = new Ship();

    alice.fillShip();
    maria.fillShip();

    alice.shipStatus();
    System.out.println();
    maria.shipStatus();

    System.out.println();
    System.out.println();
    alice.battle(maria);

    alice.shipStatus();
    System.out.println();
    maria.shipStatus();

  }
}
