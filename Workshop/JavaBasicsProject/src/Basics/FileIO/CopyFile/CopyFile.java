package Basics.FileIO.CopyFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

  // Write a function that copies the contents of a file into another file
  // It should take two filenames (string) as parameters:
  //  - path and name of the source file
  //  - path and name of the target file
  // It should return a boolean that shows if the copy was successful
  public static void main(String[] args) {
    String sourcePathAsString = "src/Basics.FileIO/CopyFile/duplicated-chars.txt";
    String targetPathAsString = "src/Basics.FileIO/CopyFile/target.txt";

    boolean isSuccessful = copyContent(sourcePathAsString,targetPathAsString);

    //test
    System.out.println(isSuccessful);

  }

  private static boolean copyContent(String sourcePathAsString, String targetPathAsString) {
    Path sourcePath = Paths.get(sourcePathAsString);
    Path targetPath = Paths.get(targetPathAsString);

    List<String> content;

    try {
      content = Files.readAllLines(sourcePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      return false;
    }
    try {
      Files.write(targetPath,content, StandardCharsets.UTF_8);
    } catch (IOException e) {
      return false;
    }
    return true;
  }


}
