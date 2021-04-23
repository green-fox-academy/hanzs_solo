package Basics.OO.PetrolStation;

public class Main {
  //  Create Station and Car classes
  //      Station
  //  it stores how much gas is avaliable: gasAmount
  //  it can refill a car: refill(car):
  //  decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
  //  increases the car's gasAmount
  //      Car
  //  it stores how much gas is actually present: gasAmount
  //  it stores the capacity of the tank: capacity
  //  create a constructor for the Car class where you:
  //  initialize gasAmount -> 0
  //  initialize capacity -> 100
  public static void main(String[] args) {

    //test
    Car trabant = new Car();
    Station MOL = new Station();
    MOL.gasAmount = 10000;

    System.out.println("Car gas amount: " + trabant.gasAmount + " | capacity: " + trabant.capacity);
    System.out.println("Station gas amount: " + MOL.gasAmount);

    System.out.println();
    MOL.refill(trabant);

    System.out.println("Car gas amount: " + trabant.gasAmount + " | capacity: " + trabant.capacity);
    System.out.println("Station gas amount: " + MOL.gasAmount);
    //
  }
}
