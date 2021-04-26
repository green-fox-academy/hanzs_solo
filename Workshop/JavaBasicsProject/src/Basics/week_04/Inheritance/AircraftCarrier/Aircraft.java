package Basics.week_04.Inheritance.AircraftCarrier;

//Aircrafts
//    Create a class that represents an aircraft
//    There are 2 types of aircrafts: F16 and F35
//    Both aircrafts should keep track of their ammunition
//
//    F16
//    Max ammo: 8
//    Base damage: 30
//
//    F35
//    Max ammo: 12
//    Base damage: 50
//
//    All aircrafts should be created with an empty ammo storage

//Methods
//    fight()
//      It should use all the ammo (set it to 0) and it should return the damage it causes
//      damage is calculated by multiplying the base damage by the ammunition
//    refillAmmo()
//      It should take a number as parameter that represents the ammunition coming from a station
//      Increase the ammo of the aircraft by the right amount
//      It can't have more ammo than the parameter value or the max ammo of the aircraft
//      It should return the remaining (unused) ammo
//      Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
//    getType()
//      It should return the type of the aircraft as a string
//    getStatus()
//      It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
//    isPriority()
//      It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16

//
//Class
//superclass
public class Aircraft {
  //
  //fields
  private String type;
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;
  private boolean isPriority;

  //
  //constructors
  Aircraft() {
    currentAmmo = 0;
  }

  //
  //methods
  public int getAllDamage() {
    return currentAmmo * baseDamage;
  }

  public int fight() {
    int allDamage = getAllDamage();
    currentAmmo = 0;
    return allDamage;
  }

  public int refillAmmo(int ammo) {
    int remaining = ammo - (maxAmmo - currentAmmo);
    if (remaining > 0) {
      currentAmmo = currentAmmo + (ammo - remaining);
      return remaining;
    } else {
      currentAmmo = currentAmmo + ammo;
      return 0;
    }
  }

  public void getStatus() {
    System.out.println(
        "Type: " + getType() + ", Ammo: " + getCurrentAmmo() + ", All Damage: " + getAllDamage());
  }


  //
  //getters and setters
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public boolean isPriority() {
    return isPriority;
  }

  public void setPriority(boolean priority) {
    isPriority = priority;
  }
}
