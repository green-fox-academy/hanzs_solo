package Basics.week_02.ExpressionsAndControlFlow.UserInput;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it

    double miles, km;

    Scanner input = new Scanner(System.in);

    System.out.println("How much miles? ");
    miles = input.nextDouble();
    km = miles * 1.609;
    System.out.println("Thats: " + km + " Km.");
  }
}
