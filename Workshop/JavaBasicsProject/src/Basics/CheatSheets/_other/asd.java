package Basics.CheatSheets._other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asd {
  public static void main(String[] args) {

    char ch = 'á';
    System.out.println((int) ch);

    String str = "ez egy rovid mondat";
    char[] charArr = str.toCharArray();

    int[] intArr = new int[charArr.length];
    for (int i = 0; i < charArr.length; i++) {
      intArr[i] = charArr[i];
    }

    System.out.println(Arrays.toString(charArr));
    System.out.println(Arrays.toString(intArr));

  }



}
