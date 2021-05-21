package week_02.ExpressionsAndControlFlow.Conditionals;

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    int numberOne, numberTwo;
    Scanner input = new Scanner(System.in);

    System.out.println("Number one: ");
    numberOne = input.nextInt();
    System.out.println("Number two: ");
    numberTwo = input.nextInt();

      if (numberOne > numberTwo) {
          System.out.println(numberOne + " is bigger number.");
      } else {
          System.out.println(numberTwo + " is bigger number.");
      }

  }
}
