package Loops;

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number
    // It would ask this many times to enter an integer
    // If all the integers are entered it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    int howMany;
    float average, sum;
    Scanner input = new Scanner(System.in);


    System.out.print("How many numbers do you want to enter? ");
    howMany = input.nextInt();
    System.out.println();
    int[] numbers = new int[howMany];
    sum = 0;
    average = 0;

    for (int i = 1; i <= howMany; i++) {
      System.out.print("#" + i + " - ");
      numbers[i - 1] = input.nextInt();
      System.out.println("");
      sum += numbers[i - 1];

    }
    average = sum / howMany;

    System.out.println("Sum: " + sum + ", Average: " + average);


  }
}
