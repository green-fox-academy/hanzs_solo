package Basics.week_03.Recursion;

public class Bunnies {
  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears
  // across all the bunnies recursively (without loops or multiplication).
  public static void main(String[] args) {
    int bunnies = 8;
    System.out.println(countEars(bunnies));
  }

  private static int countEars(int bunnies) {
    if (bunnies > 0) {
      return 2 + countEars(bunnies - 1);
    }
    return 0;
  }
}
