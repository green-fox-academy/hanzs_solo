package Basics.Arrays;

import java.util.Arrays;

public class SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `orders`
    //   with the following content: `["first", "second", "third"]`
    String[] orders = {"first", "second", "third"};
    // - Swap the first and the third element of `orders`
    String temp = orders[0];
    orders[0] = orders[2];
    orders[2] = temp;

    //check
    System.out.println(Arrays.toString(orders));
  }
}
