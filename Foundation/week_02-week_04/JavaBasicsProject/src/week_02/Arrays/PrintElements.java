package week_02.Arrays;

public class PrintElements {
  public static void main(String[] args) {
    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    int[] numbers = {4, 5, 6, 7};
    // - Print all the elements of `numbers`
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
