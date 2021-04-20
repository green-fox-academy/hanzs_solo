package Basics.FileIO.CountLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string as a parameter
    // and returns the number of lines the file contains.
    // It should return zero if it can't open the file
    // and should not raise any error.


    String filename = "text.txt";
    int numberOfLines = getNumberOfLines(filename);

    //test
    System.out.println(numberOfLines);

  }

  private static int getNumberOfLines(String fileName) {
    Path filePath = Paths.get("src/Basics.FileIO/CountLines/" + fileName);
    try {
      return Files.readAllLines(filePath).size();
    } catch (IOException e) {
      return 0;
    }
  }
}
