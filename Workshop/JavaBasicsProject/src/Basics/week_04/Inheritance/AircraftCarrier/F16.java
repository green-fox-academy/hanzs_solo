package Basics.week_04.Inheritance.AircraftCarrier;


//F16
//    Max ammo: 8
//    Base damage: 30
public class F16 extends Aircraft {
  //
  // constructors
  public F16() {
    setType("F16");
    setMaxAmmo(8);
    setBaseDamage(30);
    setPriority(false);
  }
}
