package Conventionals;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // then prints "Odd" if the number is odd, or "Even" if it is even

    int number, remaining;
    Scanner input = new Scanner(System.in);

    System.out.println("Check this number: ");
    number = input.nextInt();

    remaining = number % 2;

      if (remaining == 0) {
          System.out.println("This number is even");
      } else {
          System.out.println("This number is odd");
      }
  }


}
