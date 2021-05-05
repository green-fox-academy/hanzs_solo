package Basics.week_04.Inheritance.AircraftCarrier;

//class
public class Main {
  public static void main(String[] args) {

    Carrier stobar = new Carrier(2000, 1500);
    Carrier catobar = new Carrier(1200, 2000);

    Aircraft f16_01 = new F16();
    Aircraft f35_01 = new F35();
    Aircraft f35_02 = new F35();
    stobar.add(f16_01);
    stobar.add(f35_01);
    stobar.add(f35_02);
    stobar.fill();

    Aircraft f16_02 = new F16();
    Aircraft f16_03 = new F16();
    Aircraft f16_04 = new F16();
    Aircraft f35_03 = new F35();
    Aircraft f35_04 = new F35();
    catobar.add(f16_02);
    catobar.add(f16_03);
    catobar.add(f16_04);
    catobar.add(f35_03);
    catobar.add(f35_04);
    catobar.fill();

    System.out.println(stobar.getStatus());
    System.out.println();
    System.out.println(catobar.getStatus());

    System.out.println();
    stobar.fight(catobar);
    stobar.fill();
    System.out.println();

    System.out.println(stobar.getStatus());
    System.out.println();
    System.out.println(catobar.getStatus());
  }
}
