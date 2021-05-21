package week_02.ExpressionsAndControlFlow.UserInput;

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet the User instead of the World!
    // The program should ask for the name of the User

    String fullName;

    Scanner input = new Scanner(System.in);

    System.out.println("Tell your full name dude: ");
    fullName = input.nextLine();
    System.out.println("Your full name is: " + fullName);
  }
}
