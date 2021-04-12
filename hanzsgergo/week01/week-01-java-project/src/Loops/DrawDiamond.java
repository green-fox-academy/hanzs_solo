package Loops;

import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    float rows, iRows, dRows, currentRow, stars, spaces;
    Scanner input = new Scanner(System.in);
    int isEven;


    System.out.println("How much rows do you want? ");
    rows = input.nextInt();
    iRows = Math.round(rows / 2);
    dRows = rows - iRows;

    if (rows % 2 != 0) {
      isEven = 0;
    } else {
      isEven = 1;
    }


    System.out.print(iRows + " row increasing. ");
    System.out.println(dRows + " row decreasing.");

    //Increasing

    currentRow = 1;
    while (currentRow <= iRows) {
      spaces = 0;
      while (spaces < iRows - currentRow) {
        System.out.print(" ");
        spaces++;
      }
      stars = 0;
      while (stars < currentRow * 2 - 1) {
        System.out.print("*");
        stars++;
      }
      System.out.println("");
      currentRow++;
    }

    //Decreasing

    currentRow = 1;
    while (currentRow <= dRows) {
      spaces = 0;
      while (spaces < currentRow - isEven) {
        System.out.print(" ");
        spaces++;
      }
      stars = 0;
      while (stars < dRows * 2 - currentRow * 2 + 1) {
        System.out.print("*");
        stars++;
      }
      System.out.println("");
      currentRow++;

    }

  }
}
