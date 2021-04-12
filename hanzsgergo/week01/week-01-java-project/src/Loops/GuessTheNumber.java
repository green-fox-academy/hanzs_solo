package Loops;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number and the user has to figure it out
    // The user can input guesses
    // After each guess the program would tell one of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8

    int storedNumber, guess;
    Scanner input = new Scanner(System.in);
    storedNumber = 8;

    System.out.print("Guess the stored number: ");
    guess = input.nextInt();
    System.out.println("");

    while (guess != 8) {
        if (guess > storedNumber) {
            System.out.println("The stored number is lower");
        }
        if (guess < storedNumber) {
            System.out.println("The stored number is higher");
        }
      System.out.print("Guess one more time: ");
      guess = input.nextInt();
      System.out.println("");
    }
      if (guess == 8) {
          System.out.println("You found the number: 8");
      }

  }
}
