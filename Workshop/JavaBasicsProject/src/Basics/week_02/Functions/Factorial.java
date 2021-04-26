package Basics.week_02.Functions;

//  Create the usual class wrapper and main method on your own
public class Factorial {
  public static void main(String[] args) {
    int number = -1;
    int check = calculateFactorial(number);

    //check
    System.out.println(check);

  }

  // - Create a function called `calculateFactorial()`
  //   that returns the factorial of its input
  public static int calculateFactorial(int num) {

    //what if wrong input?
    int result = 0;
    if (num <= 0) {
      System.out.println("You have to enter a non-negative number.");
      return 0;
    }
    //what if num is zero?
    else if (num == 0) {
      return 0;
    }

    else {

      //main
      result = 1;
      for (int i = 1; i <= num; i++) {
        result *= i;
      }
      return result;
      //

    }
  }
}
