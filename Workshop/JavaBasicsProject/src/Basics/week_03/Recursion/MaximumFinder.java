package Basics.week_03.Recursion;

public class MaximumFinder {
  // Write a function that finds the largest element of an array using recursion.

  public static void main(String[] args) {
    int[] numbers = {10, 5, 44, 11, 346, 324, 99};
    int n = numbers.length - 1;

    System.out.println(findMax(numbers, n));
  }

  private static int findMax(int[] numbers, int n) {
    if (n >= 0) {
      if (numbers[n] > findMax(numbers, n - 1)) {
        return numbers[n];
      } else {
        return numbers[n - 1];
      }
    }
    return 0;
  }
}
