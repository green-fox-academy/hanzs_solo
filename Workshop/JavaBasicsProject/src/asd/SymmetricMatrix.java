package asd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymmetricMatrix {
  public static void main(String[] args) {

    int[][] matrix1 = new int[3][3];

    // 0, 2, 3
    // 2, 0, 3
    // 3, 3, 0

    // x:0 y:0 | x:1 y:0 | x:2 y:0
    // x:0 y:1 | x:1 y:1 | x:2 y:1
    // x:0 y:2 | x:1 y:2 | x:2 y:2

    matrix1[0][0] = 0;
    matrix1[0][1] = 2;
    matrix1[0][2] = 3;

    matrix1[1][0] = 2;
    matrix1[1][1] = 0;
    matrix1[1][2] = 3;

    matrix1[2][0] = 3;
    matrix1[2][1] = 3;
    matrix1[2][2] = 0;

    System.out.println("matrix1 is simmetric: " + isSymmetric(matrix1));

    // 3, 6, 8
    // 5, 3, 1
    // 5, 1, 6
    int[][] matrix2 = new int[3][3];


    matrix2[0][0] = 3;
    matrix2[0][1] = 6;
    matrix2[0][2] = 8;

    matrix2[1][0] = 5;
    matrix2[1][1] = 3;
    matrix2[1][2] = 1;

    matrix2[2][0] = 5;
    matrix2[2][1] = 6;
    matrix2[2][2] = 6;

    System.out.println("matrix2 is simmetric: " + isSymmetric(matrix2));
  }

  public static boolean isSymmetric(int[][] matrix) {
    if (!checkMatrixIfNotNxN(matrix)) {
      System.out.println("this matrix is not n*n");
      return false;
    }

    int n = matrix.length;

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < n; x++) {
        if (matrix[x][y] != matrix[y][x]) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean checkMatrixIfNotNxN(int[][] matrix) {
    for (int[] rows : matrix) {
      if (rows.length != matrix.length) {
        return false;
      }
    }
    return true;
  }
}
