package Basics.Loops;

import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5

    int from, to;
    Scanner input = new Scanner(System.in);
    boolean bigger = false;


    do {
      System.out.println("Tell me number to count from: ");
      from = input.nextInt();

      System.out.println("Tell me the number where counting should end: ");
      to = input.nextInt();

        if (to <= from) {
            System.out.println("The second number should be bigger");
        } else {
            bigger = true;
        }
    } while (!bigger);

    while (from <= to) {
      System.out.println(from);
      from++;
    }

  }


}

