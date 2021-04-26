package Basics.week_02.HardOnes;

import java.util.Arrays;

public class FindPartOfAnInteger {
  public static void main(String[] args) {

    int number = 1;
    int[] numbers = {1, 11, 34, 52, 61};

    // Note: We are using Arrays.toString() function to print the array returned
    // You could just as well iterate over the array and print its items one by one

    //  Examples:
//    System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
    //  should print: `[0, 1, 4]`
//    System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
    //  should print: '[]'

    System.out.println(Arrays.toString(whereAreTheClonesFunction(number, numbers)));

  }

    //  Create a function that takes a number and an array of integers as parameters
    //  It returns the indices of the integers of the array which contain the given number
    //  or returns an empty array (if the number is not part of any of the integers in the array)
  public static int[] whereAreTheClonesFunction(int num, int[] arr) {

    //main
    int[] indices = new int[arr.length];
    String numAsText = Integer.toString(num);
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      String currentNumAsText = Integer.toString(arr[i]);
      if (currentNumAsText.contains(numAsText)) {
        indices[j] = i;
        j++;
      }
    }
    //

    //check
    System.out.println(Arrays.toString(indices));

    //indices[] length fix
    int[] indicesFixedLenght = new int[j];
    for (int i = 0; i < indicesFixedLenght.length; i++) {
      indicesFixedLenght[i] = indices [i];
    }

    //
    //check
    System.out.println(Arrays.toString(indicesFixedLenght));


    return indicesFixedLenght;
  }


}
