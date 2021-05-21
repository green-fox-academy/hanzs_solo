package week_02.ExpressionsAndControlFlow.Conditionals;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    int number;
    Scanner input = new Scanner(System.in);

    System.out.print("Check this number: ");
    number = input.nextInt();

    System.out.println();

    // then prints "Odd" if the number is odd, or "Even" if it is even
    int remaining = number % 2;

      if (remaining == 0) {
          System.out.println("This number is even");
      } else {
          System.out.println("This number is odd");
      }
  }


}
