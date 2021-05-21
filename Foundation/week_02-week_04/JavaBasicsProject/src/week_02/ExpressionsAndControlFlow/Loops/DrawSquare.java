package week_02.ExpressionsAndControlFlow.Loops;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    //
    // The square should have as many lines as the number was


    int n = 10;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
          System.out.print(" % ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
  }
}
