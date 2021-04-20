package Basics.FileIO.DivideByZero;

public class DivideByZero {
  public static void main(String[] args) {
    int number = 10;
    int divisor = 0;

    doDivision(number, divisor);

  }

  // Create a function that divides number 10
  // by a number that's passed as a paramater and prints the result.
  // It should print "fail" if the parameter is 0
  private static void doDivision(int number, int divisor) {
    int result;
    try {
      result = number / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }

}
