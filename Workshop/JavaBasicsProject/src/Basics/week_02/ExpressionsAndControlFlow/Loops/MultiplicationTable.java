package Basics.week_02.ExpressionsAndControlFlow.Loops;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    // Create a program that asks for a number and prints the multiplication table with that number
    //
    // Example:
    // The number 15 should print:
    //
    // 1 * 15 = 15
    // 2 * 15 = 30
    // 3 * 15 = 45
    // 4 * 15 = 60
    // 5 * 15 = 75
    // 6 * 15 = 90
    // 7 * 15 = 105
    // 8 * 15 = 120
    // 9 * 15 = 135
    // 10 * 15 = 150


    Scanner input = new Scanner(System.in);
    int number;

    System.out.println("Number: ");
    number = input.nextInt();

    System.out.println("Multiplication table of number " + number + " is: ");

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " * " + number + " = " + i * number);
    }
  }
}
