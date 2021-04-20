package Basics.FileIO.Logs;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP adresses
  // Write a function that returns the GET / POST request ratio
  public static void main(String[] args) {

    Path filePath = Paths.get("src/Basics/FileIO/Logs/log.txt");

    List<String[]> separatedContent = getSeparateContent(filePath);

    getUniqueIPs(separatedContent);

  }

  private static void getUniqueIPs(List<String[]> separatedContent) {
    List<String> ips = new ArrayList<>();

  }

  private static List<String[]> getSeparateContent(Path filePath) {
    List<String> content = new ArrayList<>();

    try {
      content = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }

    List<String[]> separatedContent = new ArrayList<>();
    for (String line : content) {
      String[] separatedLine = line.split("   ");
      separatedContent.add(separatedLine);
    }

    return separatedContent;
  }
}
