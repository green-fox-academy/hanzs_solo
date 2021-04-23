package Basics.Recursion;

public class NumberAdder {

  // Write a recursive function that takes one parameter: n and
  // adds numbers from 1 to n.
  public static void main(String[] args) {
    int n = 1;

    System.out.println(numberAdder(n));
  }

  private static int numberAdder(int n) {
    if (n == 0) return 0;

    int result;
    if (n > 1) {
      result = n * numberAdder(n - 1);
      return result;
    }
    return 1;
  }


}
