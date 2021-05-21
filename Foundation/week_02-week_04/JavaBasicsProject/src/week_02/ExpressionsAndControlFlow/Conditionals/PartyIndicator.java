package week_02.ExpressionsAndControlFlow.Conditionals;

import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second represents the number of boys
    int girls, boys;
    Scanner input = new Scanner(System.in);

    System.out.println("How much girls came to the party: ");
    girls = input.nextInt();
    System.out.println("How much boys came to the party: ");
    boys = input.nextInt();

    //
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    // it should print: The party is excellent!
    //
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    // it should print: Quite a cool party!
    //
    // If there are less people coming than 20
    // it should print: Average party...
    //
    // If no girls are coming, regardless the count of the people
    // it should print: Sausage party

    //changed the execution order
    if (girls == 0) {
      System.out.println("Sausage party...");
    }
    if (girls == boys && girls + boys >= 20) {
      System.out.println("The party is excellent!");
    }
    if (girls + boys >= 20) {
      System.out.println("Quite a cool party!");
    }
    if (girls + boys < 20) {
      System.out.println("Average Party!");
    }
  }

}
