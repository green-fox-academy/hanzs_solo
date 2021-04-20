package Basics.FileIO.Doubled;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  // Create a method that decrypts the duplicated-chars.txt.
  // Decryption is the process reversing an encryption, i.e. the process
  // which converts encrypted data into its original form.

  public static void main(String[] args) {
    Path filePath = Paths.get("src/Basics.FileIO/Doubled/duplicated-chars.txt");
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

    //we gonna save here the new content
    List<String> newContent = new ArrayList<>();

    //iterate trough the lines of original content
    for (String line : content) {
      //save line characters in a char array
      char[] chars = line.toCharArray();

      List<Character> charList = new ArrayList<>();

      //append each character to the newLine String
      StringBuilder newLine = new StringBuilder();
      for (int i = 0; i < chars.length; i += 2) {
        newLine.append(chars[i]);
      }

      //add this string to the new content
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

