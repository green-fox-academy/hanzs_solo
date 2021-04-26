package Basics.week_02.ExpressionsAndControlFlow.UserInput;

import java.util.Scanner;

public class AnimalsAndLegs {

  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    Scanner input = new Scanner(System.in);

    int pigs, chickens, pigLegAmount, chickenLegAmount, totalLegs;

    System.out.println("Tell me how much pigs do you have: ");
    pigs = input.nextInt();
    System.out.println("Tell me how much chickens do you have ");
    chickens = input.nextInt();

    pigLegAmount = 4;
    chickenLegAmount = 2;

    totalLegs = pigs * pigLegAmount + chickens * chickenLegAmount;

    System.out.println("You have " + totalLegs + " animal legs.");

  }

}

