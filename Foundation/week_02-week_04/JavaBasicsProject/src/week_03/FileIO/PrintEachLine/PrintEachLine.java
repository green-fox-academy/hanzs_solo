package week_03.FileIO.PrintEachLine;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".

                                                           //wrong Path
    Path filePath = Paths.get("src/Basics.FileIO/PrintEachLine/your-file.txt");
    List<String> fileContent = new ArrayList<>();
    fileContent = getFileContent(filePath);

    //test
    System.out.println(fileContent);

  }

  private static List<String> getFileContent(Path filePath) {
    List<String> fileContent = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
    return fileContent;
  }
}