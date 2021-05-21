package week_04.Inheritance.AircraftCarrier;


/**
 * Aircrafts
 * Create a class that represents an aircraft
 * There are 2 types of aircrafts: F16 and F35
 * Both aircrafts should keep track of their ammunition
 * <p>
 * F16
 * Max ammo: 8
 * Base damage: 30
 * <p>
 * F35
 * Max ammo: 12
 * Base damage: 50
 * <p>
 * All aircrafts should be created with an empty ammo storage
 */

//
//Class
//superclass
public abstract class Aircraft {
  //
  //fields
  private final String type;
  private int currentAmmo;
  private final int maxAmmo;
  private final int baseDamage;
  private final boolean priority;

  //
  //constructors
  Aircraft(String type, int maxAmmo, int baseDamage, boolean priority) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.priority = priority;
    currentAmmo = 0;
  }

  //
  //methods
  /**
   * fight()
   * It should use all the ammo (set it to 0) and it should return the damage it causes
   * damage is calculated by multiplying the base damage by the ammunition
   */
  public int fight() {
    int currentDamage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return currentDamage;
  }

  /**
   * refillAmmo()
   * It should take a number as parameter that represents the ammunition coming from a station
   * Increase the ammo of the aircraft by the right amount
   * It can't have more ammo than the parameter value or the max ammo of the aircraft
   * It should return the remaining (unused) ammo
   * Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
   */
  public int refillAmmo(int ammo) {
    int missingAmmo = getMissingAmmo();
    if (ammo != 0 && missingAmmo != 0) {
      if (ammo > missingAmmo) {
        currentAmmo = maxAmmo;
        ammo = ammo - missingAmmo;
      } else {
        currentAmmo = currentAmmo + ammo;
        ammo = 0;
      }
    }
    return ammo;
  }

  public int getMissingAmmo() {
    return maxAmmo - currentAmmo;
  }

  public int getCurrentDamage() {
    return currentAmmo * baseDamage;
  }

  /**
   * getStatus()
   * It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
   */
  public String getStatus() {
    return "Type: " + type + ", Ammo: " + currentAmmo + " Base Damage: " + baseDamage +
        ", All Damage: " +
        currentAmmo * baseDamage;
  }

  //
  //getters and setters

  /**
   * getType()
   * It should return the type of the aircraft as a string
   */
  public String getType() {
    return type;
  }

  /**
   * isPriority()
   * It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
   */
  public boolean isPriority() {
    return priority;
  }

}
