package week_03.FileIO.ReversedOrder;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    Path filePath = Paths.get("src/Basics/FileIO/ReversedOrder/reversed-order.txt");
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


    //iterate trough the lines in reverse order and add each to newContent
    for (int i = content.size()-1; i >= 0; i--) {
      newContent.add(content.get(i));
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