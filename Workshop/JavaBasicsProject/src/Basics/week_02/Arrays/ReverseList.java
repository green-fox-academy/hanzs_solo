package Basics.week_02.Arrays;

import java.util.Arrays;

public class ReverseList {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
    //   with the following content: `[3, 4, 5, 6, 7]`
    int[] numbers = {3, 4, 5, 6, 7};

    // - Reverse the order of the elements of `numbers`
    int[] tempArray = new int[numbers.length];

    for (int i = 0; i< numbers.length;i++){

      tempArray[i] = numbers[numbers.length-i-1];
    }

    numbers = tempArray;

    // - Print the elements of the reversed `numbers`
    System.out.println(Arrays.toString(numbers));

  }
}

