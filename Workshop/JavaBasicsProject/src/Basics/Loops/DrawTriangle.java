package Basics.Loops;

import java.util.Scanner;

public class DrawTriangle {


    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        int rows, currentRow, stars;
        Scanner input = new Scanner(System.in);

        System.out.println("Lets print a triangle!");
        System.out.println("How much rows do you want? ");
        rows = input.nextInt();

        currentRow = 0;
        while (currentRow < rows) {
            stars = 0;
            while (stars <= currentRow) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            currentRow++;
        }

        System.out.println("");
        System.out.println("How much rows do you want? ");
        rows = input.nextInt();

        currentRow = 0;
        while (currentRow < rows) {
            stars = 0;
            while (stars < rows - currentRow) {
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            currentRow++;
        }

        System.out.println("Awesome!!!");
        System.out.println("Try the other design also!");
        System.out.println("How much rows do you want? ");
        rows = input.nextInt();

        int spaces;

        currentRow = 1;
        while (currentRow <= rows) {
            spaces = 0;
            while (spaces < rows - currentRow) {
                System.out.print(" ");
                spaces++;
            }
            stars = 0;
            while (stars < currentRow *2  - 1) {
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            currentRow++;
        }
        System.out.println("What are you waiting for? ");
        System.out.println("Enter a number: ");
        rows = input.nextInt();

        //int spaces;

        currentRow = 1;
        while (currentRow <= rows) {
            spaces = 0;
            while (spaces < currentRow - 1) {
                System.out.print(" ");
                spaces++;
            }
            stars = 0;
            while (stars < rows * 2 - currentRow * 2 + 1) {
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            currentRow++;

        }
    }
}
