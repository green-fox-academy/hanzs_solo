package Basics.Variables;

import java.text.DecimalFormat;

public class Cuboid {
  public static void main(String[] args) {
    double a, b, c, volume, surface;
    a = 434.123;
    b = 124.1212;
    c = 41.123124;

    surface = 2 * (a * b + a * c + b * c);
    volume = a * b * c;

    System.out.println("Surface Area: " + surface);
    System.out.println("Volume: " + volume);

    //Rounding
    DecimalFormat df = new DecimalFormat("#########");

    System.out.println("Surface Area: " + df.format(surface));
    System.out.println("Volume: " + df.format(volume));


  }
}
