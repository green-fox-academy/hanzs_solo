package Basics.Recursion;

public class SumDigits {
  // Given a non-negative integer n, return the sum of it's digits recursively
  // (without loops).
  //
  // Hint
  //
  // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
  //
  // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
  public static void main(String[] args) {

    int n = 126;
    System.out.println(mivan(n));
  }

  private static int mivan(int n) {
    if (n < 10) {
      return n;
    } else {
      int result = n % 10 + mivan(n / 10);
      return result;
    }
  }
}
