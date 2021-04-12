package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner input = new Scanner(System.in);

        String fullName;

        System.out.println("Tell your name your full dude: ");
        fullName = input.nextLine();
        System.out.println("Your full name is: " + fullName);
    }
}
