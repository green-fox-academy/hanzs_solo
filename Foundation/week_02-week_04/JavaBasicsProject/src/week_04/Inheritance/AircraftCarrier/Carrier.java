package week_04.Inheritance.AircraftCarrier;

/**
 * Aircrafts:
 * Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
 * Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
 * Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
 * Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
 * Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
 * <p>
 * If the health points are 0 then it should return: It's dead Jim :(
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Create a class that represents an aircraft-carrier
 * The carrier should be able to store aircrafts
 * Each carrier should have a store of ammo represented by a number
 * The initial ammo should be given as a constructor parameter
 * The carrier also has a health point which is also given as a constructor parameter
 */
public class Carrier {

  //
  //fields
  List<Aircraft> aircrafts = new ArrayList<>();
  int storedAmmo;
  int health;


  //
  // constructors
  Carrier(int storedAmmo, int health) {
    this.storedAmmo = storedAmmo;
    this.health = health;
  }

  //
  //methods
  /**
   * add()
   * It should take a new aircraft and add it to its storage
   */


  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }


  /**
   * fill()
   * It should fill all the aircrafts with ammo and subtract the taken ammo from the ammo storage
   * If there is not enough ammo it should start to fill the aircrafts that are priority first
   * It should throw an exception if there is no ammo when this method is called
   */
  public void fill() {

    for (Aircraft aircraft : aircrafts) {
      if (aircraft.isPriority()) {
        storedAmmo = aircraft.refillAmmo(storedAmmo);
      }
      if (storedAmmo == 0) {
        throw new IllegalArgumentException("There is not enough fuel to fill the aircrafts");
      }
    }
    for (Aircraft aircraft : aircrafts) {
      if (!aircraft.isPriority()) {
        storedAmmo = aircraft.refillAmmo(storedAmmo);
      }
      if (storedAmmo == 0) {
        throw new IllegalArgumentException("There is not enough fuel to fill the aircrafts");
      }
    }
  }

  /**
   * fight()
   * It should take another carrier as a reference parameter and
   * fire all the ammo from the aircrafts to it
   * subtract all the damage from the other carrier's health points
   */
  public void fight(Carrier enemyCarrier) {
    for (Aircraft aircraft : aircrafts) {
      enemyCarrier.health -= aircraft.fight();
    }
  }

  /**
   * getStatus()
   * It should return a string describing its, and all of its aircrafts' statuses in the following format:
   * HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
   * <p>
   * Aircrafts:
   * Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
   * Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
   * Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
   * Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
   * Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
   * <p>
   * If the health points are 0 then it should return: It's dead Jim :(
   */
  public String getStatus() {
    if (health == 0) {
      return "It's dead Jim :(";
    }
    int totalDamage = 0;
    StringBuilder sb = new StringBuilder();
    for (Aircraft aircraft : aircrafts) {
      totalDamage += aircraft.getCurrentDamage();
      sb.append(aircraft.getStatus()).append("\n");
    }
    return "HP: " + health + ", Aircraft Count: " + aircrafts.size() + ", Ammo Storage: " +
        storedAmmo + ", Total Damage " + totalDamage + "\n\n" + sb;

  }

  //
  //getters and setters

}
