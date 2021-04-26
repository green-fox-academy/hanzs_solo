package Basics.week_03.FileIO.WriteMultipleLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  // Create a function that takes 3 parameters: a path, a word and a number
  // and is able to write into a file.
  // - The path parameter should be a string that describes the location (path & name)
  //    of the file you wish to modify.
  // - The word parameter should also be a string that will be written to the file as individual lines.
  // - The number parameter should describe how many lines the file should have.

  // If the word is 'apple' and the number is 5, it should write 5 lines
  // into the file and each line should read 'apple'.
  // The function should not raise any errors if it could not write the file.


  public static void main(String[] args) {
    String pathAsString = "src/Basics.FileIO/WriteMultipleLines/geri-vagyok.txt";
    String word = "Geri vagyok!";
    int number = 10;

    writeThisToFile(pathAsString, word, number);
  }

  private static void writeThisToFile(String pathAsString, String word, int number) {
    Path path = Paths.get(pathAsString);
    List<String> content = new ArrayList<>();

    //fill content list
    for (int i = 0; i < number; i++) {
      content.add(word);
    }

    //write content list into file
    try {
      Files.write(path, content);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
