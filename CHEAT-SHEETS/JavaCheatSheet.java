package com.company;

import java.util.Scanner;

public class JavaCheatSheet {

    //##################    CHEAT-SHEET   #######################
    //##################    DO NOT RUN    #######################


    public static void cheats(String[] args) {

        //##################    VARIABLES   ####################### //syntax: variable-type name = value;

        //text
        String text = "Távirányítós autó";  // !!! MUST USE "DOUBLE QUOTES"

        //numbers
        //whole
        byte w8bit = 10;                // 1 byte: -128  to  127
        short w16bit = 100;             // 2 bytes: -32,768  to  32,767
        int w32bit = 1000;              // 4 bytes: -2,147,483,648  to  2,147,483,647
        long w64bit = 9999999999L;      // !!! MUST TYPE "L" AFTER VALUE; 8 bytes: -9,223,372,036,854,775,808  to  9,223,372,036,854,775,807
        //floating point
        float f32bit = 3.1415f;             // !!! MUST TYPE "f" AFTER VALUE; up to 6-7 decimal digits
        double f64bit =  3.1415926535d;     // !!! MUST TYPE "d" AFTER VALUE; up to 15 decimal digits

        //logical
        boolean bool = false;       //1 bit: true or false

        //character
        char singleCharacter = 'a';      // !!! MUST USE 'SINGLE QUOTES'; 2 bytes: 1 letter/character
        char singleAsciiValue = 27;     // !!! DO NOT USE 'SINGLE QUOTES'; 2 bytes: 1 ASCII value


        //final means READ_ONLY
        final double pi = 3.14159265358979d;

    }





    //--------------------------------------------------------------
    //##################    BASIC SYNTAXES   #######################
    //--------------------------------------------------------------


    //##################    PRINT INTO CONSOLE    #######################

    public static void printToConsole (String[] args) {
        String text1, text2, message;
        text1 = "medve";
        text2 = "brumm";
        int num = 2;

        System.out.println("MEDVE");

        System.out.println(text1 + text2);

        System.out.println(num + " " + text1 + " jön le a hegyről. " + text2 + ", " + text2);

        message = num + " " + text1 + " jön le a hegyről. " + text2 + " " + text2;
        System.out.println(message);

        String message2 = text2 + ", " + text2;  //just declaring a new variable here
        System.out.println(message2);

        }


    //##################    MATHEMATICS   #######################

    public static void numberOperations (String[] args){
        //operators
        //  +   add
        //  -   subtract
        //  *   multiply
        //  /   divide (tricky)
        //  %   maradékos osztás: az osztás maradékát adja eredményül

        int a, b, c, d;
        float e, f;
        double result;

        a = 2;
        b = 5;
        c = 10;
        d = 64;

        e = 3.5f;
        f = 2f;



        // addition and subtraction
        result = 2 + 4;
        result = a + b;
        result = 10 - a;
        result = a +  23415 - b + c;

        // incrementing by 1
        a++;

        // decrementing by 1
        a--;

        //multiply and divide
        result = c * b;
        result = c / a;         //returns 2 because both number is int
        result = 10 / 4;        //same
        result = c / f;         //returns 2.5 because we have at least one float
        result = c / (float)a;  //same
        result = 10 / 4.;       //same

        result = d % c;         // returns 4 (mert 64/10 -nek 4 a maradéka)

        //the Math method
        result = Math.pow(b, 3); //returns the value of x to the power of y
        result = Math.sqrt(b);   //returns the square root of B
        result = Math.cbrt(b);   //returns the cube root of B
        result = Math.abs(result);    //returns the absolute value of B
        result = Math.min(a,b);  //returns the number with the lowest value
        result = Math.max(a,b);  //returns the number with the highest value
        result = Math.round(result);  //returns the value of C rounded to its nearest integer
        result = Math.random();  //returns a random number between 0.0 (inclusive), and 1.0 (exclusive)

        //**feeding an 'int' with a 'float' in chase you are sure its a whole number
        float y = 2f;
        int x;
        x = (int) y;
    }


    //##################    GET INPUT FROM CONSOLE    #######################

    public static void getInput (String[] sqrt){

        // !!! you have to import this "feature" first usally at the very top of your code
        //like this: import java.util.Scanner;

        Scanner myInput = new Scanner(System.in);

        String favoriteText;

        System.out.println("Please enter your favourite text: ");
        favoriteText = myInput.next();  //expecting text and waiting for enter
        System.out.println("Your favourite text is: " + favoriteText);

        int favoriteNumber;

        System.out.println("Please enter your favourite number: ");
        favoriteNumber = myInput.nextInt();  //expecting a whole number and waiting for enter
        System.out.println("Your favourite number is: " + favoriteNumber);

    }


    //##################    BOOLEANS | LOGIC | IF | SWITCH    #######################

    public static void makeLogic (String[] args){

        //comparsion operators
        // equal to:              ==
        // not equal to:          !=
        // less than:             <
        // greater than:          >
        // less than/equal to:    <=
        // greater than/equal to: >=

        //logical operators
        // and: &&
        // or:  ||
        // xor: ^
        // not: !


        // ##IF##
        // if (this condition is true){
        //     then run this code
        // }

        // ##ELSE##
        // if (this condition is true){
        //     then run this code
        // }
        // else{
        //     if previous condition false then run this code
        // }

        // ##ELSE IF##
        // if (this condition is true){
        //     then run this code
        // }
        // if else (if previous condition is false but this is true){
        //     then run this code
        // }
        // if else (if every previous condition is false but this is true){
        //     then run this code
        // }
        // else{
        //     if every previous condition is false then run this code
        // }

        // ##SWITCH##
        //you can use only numbers
        int a = 2;
        switch (a) {
            case 1:
                //if a = 1 then run this code and do not check next case
                //if a != 1 then check next case
                break;
            case 2:
                //if a = 2 then run this code and do not check next case
                //if a != 2 then check next case
                break;
            case 3:
                //if a = 3 then run this code and do not check next case
                //if a != 3 then check next case
                break;
            default:
                //if every case is false then do this code
                //you don't have to add default case if u don't want
        }

            //if u want more than using only numbers
            //then u have to use an enumerator outside your method
            //something like this:
            /*

        enum Animal{
            DOG, CAT, SHEEP,
        }

        //now u can use these values for your switch inside your method

        public static void main(String[] args){
            Main.Animal a = Main.Animal.SHEEP;
            switch (a){
                case DOG:
                    //if a = Animal.DOG then run this code and do not check next case
                    //if a != Animal.DOG then check next case
                    break;
                case CAT:
                    //if a = Animal.CAT then run this code and do not check next case
                    //if a != Animal.CAT then check next case
                    break;
                case SHEEP:
                    //if a = Animal.SHEEP then run this code and do not check next case
                    //if a != Animal.SHEEP then check next case
                    break;
                default:
                    //if every case is false then do this code
                    //you don't have to add default case if u don't want
            }
        }
        */

    }


    //##################    LOOPS: FOR | WHILE    #######################

    public static void main (String[] args){

        // while (condition){
        //      as long as condition is true run this code
        // } if its not true anymore then exit the loop

        int i = 0;
        while (i < 5){
            System.out.println(i+1);
            i++;
        }

        // for (declaring base index; condition; change index)
        //       as long as condition is true run this code
        // }

        for (i = 0; i < 5; i++){
            System.out.println(i+1);
        }
    }
}



