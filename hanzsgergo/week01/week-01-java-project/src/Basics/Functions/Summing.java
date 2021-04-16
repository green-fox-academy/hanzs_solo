package Basics.Functions;

// Create the usual class wrapper and main method on your own
public class Summing {
  public static void main(String[] args) {

    int stopAt = 32;
    int sum = Sum(stopAt);

    //check
    System.out.println(sum);

  }

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
  public static int Sum(int number) {
    int result = 0;
    for (int i = 1; i <= number; i++) {
      result += i;
    }
    return result;
  }
}
