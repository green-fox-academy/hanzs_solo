package com.company;

import java.util.Scanner;

public class IntroduceYourself {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your nickname, age and height in meters!");

        String name;
        int age;
        float height;

        name = input.next();
        age = input.nextInt();
        height = input.nextFloat();

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);


    }


}
