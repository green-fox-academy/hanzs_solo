package week_03.FileIO.TicTacToe;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file's content

    System.out.println(ticTacResult("win-o.txt"));
    // Should print "O"

    System.out.println(ticTacResult("win-x.txt"));
    // Should print "X"

    System.out.println(ticTacResult("draw.txt"));
    // Should print "Draw"
  }

  private static String ticTacResult(String fileName) {
    Path filePath = Paths.get("src/Basics/FileIO/TicTacToe/" + fileName);
    List<String> content = new ArrayList<>();

    try {
      content = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }

    char[][] matrix = new char[3][3];
    for (int i = 0; i < content.size(); i++) {
      matrix[i] = content.get(i).toCharArray();
    }

    return logic(matrix);
  }

  private static String logic(char[][] matrix) {


    //sorok
    if (matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2]) {
      return String.valueOf(matrix[0][0]);
    }
    if (matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2]) {
      return String.valueOf(matrix[1][0]);
    }
    if (matrix[2][0] == matrix[0][1] && matrix[2][1] == matrix[2][2]) {
      return String.valueOf(matrix[2][0]);
    }

    //oszlopok
    if (matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0]) {
      return String.valueOf(matrix[0][0]);
    }
    if (matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1]) {
      return String.valueOf(matrix[0][1]);
    }
    if (matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2]) {
      return String.valueOf(matrix[0][2]);
    }

    //átlós
    if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
      return String.valueOf(matrix[0][0]);
    }
    if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
      return String.valueOf(matrix[0][2]);
    }

    return "Draw";
  }
}