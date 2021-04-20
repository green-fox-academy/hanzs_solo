package Basics.HardOnes;

import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {

    //  Example
//    System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    int[] numbers = {1, 11, 34, 11, 52, 61, 1, 34};
    findUniqueItems(numbers);

  }

    //  Create a function that takes an array of numbers as a parameter
    //  and returns an array of integers where every integer is unique (occurs only once)
  public static void findUniqueItems(int[] original) {
    
    int[] simple = new int[original.length];
    int stayHere = 0;

    for (int i = 0; i < original.length; i++) {
      int currentNumber = original[i];
    }

    //test
    System.out.println(Arrays.toString(simple));
  }

}
