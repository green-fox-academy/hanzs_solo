package Basics.week_02.ExpressionsAndControlFlow.Loops;

import java.util.Scanner;

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

    //coulomb

    int a, row, column;
    Scanner input = new Scanner(System.in);

    System.out.println("Lets draw a square!");
    System.out.println("a: ");
    a = input.nextInt();

    row = 1;
    while (row <= a) {
      if (row == 1 || row == a) {
        column = 1;
        while (column <= a) {
          System.out.print("%");
          column++;
        }
        System.out.println("");
      } else {
        column = 1;
        System.out.print("%");
        while (column <= a - 2) {
          System.out.print(" ");
          column++;
        }
        System.out.println("%");

      }
      row++;
    }
    System.out.println("");
    System.out.println("what?");

  }

}
