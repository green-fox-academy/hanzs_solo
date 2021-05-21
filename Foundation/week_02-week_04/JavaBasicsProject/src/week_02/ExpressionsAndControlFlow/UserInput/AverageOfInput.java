package week_02.ExpressionsAndControlFlow.UserInput;

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    int sum = 0;
    int a = 5;
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < a; i++) {
      sum += scanner.nextInt();
    }

    System.out.println("Sum: " + sum + ", Avarage: " + sum/a);
  }
}