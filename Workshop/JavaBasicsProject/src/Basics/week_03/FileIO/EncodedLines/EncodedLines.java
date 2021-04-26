package Basics.week_03.FileIO.EncodedLines;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
    Path filePath = Paths.get("src/Basics/FileIO/EncodedLines/encoded-lines.txt");
    String appendThis = "_encrypted";

    decryptThisMess(filePath, appendThis);

  }

  private static void decryptThisMess(Path filePath, String appendThis) {
    List<String> content = new ArrayList<>();

    //save original content in a list
    try {
      content = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }

    //we gonna save in this the new content
    List<String> newContent = new ArrayList<>();

    //iterate trough the lines of original content
    for (String line : content) {
      //save line characters in a char array
      char[] chars = line.toCharArray();

      //if char is not 'space' then decrease its decimal code by 1
      //build the new line with new characters
      StringBuilder newLine = new StringBuilder();
      for (char oldChar : chars) {
        int charDec = oldChar;
        if (oldChar != ' ') {
          charDec--;
        }
        char newChar = (char) charDec;
        newLine.append(newChar);
      }
      //add this new line to the new content
      newContent.add(newLine.toString());
    }

    //create or overwrite the encrypted file
    try {
      Path encryptedFilePath = Paths.get(filePath + appendThis);
      Files.write(encryptedFilePath, newContent);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}