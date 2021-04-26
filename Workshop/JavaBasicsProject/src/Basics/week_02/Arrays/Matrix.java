package Basics.week_02.Arrays;

public class Matrix {
  public static void main(String[] args) {
    // - Create a two dimensional array dynamically with the following content.
    //   Note that a two dimensional array is often called matrix if every
    //   internal array has the same length.
    //   Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    //   Its length should depend on a variable
    int myLenght = 4;
    int[][] matrix = new int[myLenght][myLenght];

    for (int r = 0; r < myLenght; r++) {

      for (int c = 0; c < myLenght; c++) {
        if (r == c) {
          matrix[r][c] = 1;
        } else {
          matrix[r][c] = 0;
        }
      }
    }

    //
    // - Print this two dimensional array to the output
    for (int i = 0; i < myLenght; i++) {

      for (int j = 0; j < myLenght; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }

  }
}
