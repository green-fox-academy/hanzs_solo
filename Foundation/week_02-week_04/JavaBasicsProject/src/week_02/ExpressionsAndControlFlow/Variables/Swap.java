package week_02.ExpressionsAndControlFlow.Variables;

public class Swap {
  public static void main(String[] args) {
    // Swap the values of the variables
    int a = 123;
    int b = 526;

    System.out.println(a);
    System.out.println(b);

    //Using a temporary variable
    int temp = a;
    a = b;
    b = temp;

    System.out.println(a);
    System.out.println(b);

    //Without the temporary variable
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println(a);
    System.out.println(b);
  }
}
