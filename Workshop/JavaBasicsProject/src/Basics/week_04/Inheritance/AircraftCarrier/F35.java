package Basics.week_04.Inheritance.AircraftCarrier;

//    F35
//    Max ammo: 12
//    Base damage: 50

//
//Class
//subclass of Aircraft
public class F35 extends Aircraft {
  //
  //constructor
  public F35() {
    setType("F35");
    setMaxAmmo(12);
    setBaseDamage(50);
    setPriority(true);
  }
}
