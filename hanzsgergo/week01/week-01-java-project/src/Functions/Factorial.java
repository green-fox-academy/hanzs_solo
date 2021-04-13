package Functions;

//  Create the usual class wrapper and main method on your own
public class Factorial {
  public static void main(String[] args) {
    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input
    int number = 2;
    int check = CalculateFactorial(number);

    //check
    System.out.println(check);

  }

  public static int CalculateFactorial(int num) {
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }
}
