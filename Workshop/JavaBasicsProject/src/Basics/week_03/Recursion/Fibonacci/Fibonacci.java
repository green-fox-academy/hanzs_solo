package Basics.week_03.Recursion.Fibonacci;

public class Fibonacci {
  // The fibonacci sequence is a famous bit of mathematics,
  // and it happens to have a recursive definition.
  // The first two values in the sequence are 0 and 1 (essentially 2 base cases).
  // Each subsequent value is the sum of the previous two values,
  // so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
  // Define a recursive fibonacci(n) method that
  // returns the nth fibonacci number,
  // with n=0 representing the start of the sequence.

  public static void main(String[] args) {
    int n = 1;

    for (int i = 1; i <= 10; i++) {
      System.out.println(getNthFibonacci(i - 1)*10);
    }
    //System.out.println(getNthFibonacci(n - 1)*11);
  }

  private static int getNthFibonacci(int n) {
    if (n <= 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return getNthFibonacci(n - 2) + getNthFibonacci(n - 1);
    }
  }
}
