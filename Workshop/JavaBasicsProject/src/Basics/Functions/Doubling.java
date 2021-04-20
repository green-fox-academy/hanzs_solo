package Basics.Functions;

public class Doubling {
  public static void main(String[] args) {
    // - Create an integer variable named `baseNumber` and assign the value `123` to it
    int baseNumber = 123;

    // - Print the result of `doubleNumber(baseNumber)`
    System.out.println(doubleNumber(baseNumber));

  }

  // - Create a function called `doubleNumber()` that doubles its integer input parameter
  //   and returns the doubled value
  public static int doubleNumber(int number) {
    int result = number * 2;
    return result;
  }
}
