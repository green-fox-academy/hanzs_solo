package Basics.week_02.ExpressionsAndControlFlow.Loops;

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number
    // It would ask this many times to enter an integer

    System.out.print("How many numbers do you want to enter? ");
    int howMany;
    Scanner input = new Scanner(System.in);
    howMany = input.nextInt();
    int[] numbers = new int[howMany];

    // If all the integers are entered it should print the sum and average of these
    // integers like:
    System.out.println("Feed me: ");
    float sum = 0;
    for (int i = 1; i <= howMany; i++) {

      //#4 - |
      System.out.print("#" + i + " - ");
      //#4 - 123|
      numbers[i - 1] = input.nextInt();
      //|
      System.out.println("");

      //adding new number to sum
      sum += numbers[i - 1];

    }
    float average = 0;
    average = sum / howMany;

    //
    // Sum: 22, Average: 4.4
    System.out.println("Sum: " + sum + ", Average: " + average);

  }
}
