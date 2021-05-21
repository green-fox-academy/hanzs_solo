package week_03.FileIO.Logs;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP adresses
  // Write a function that returns the GET / POST request ratio
  public static void main(String[] args) {

    Path filePath = Paths.get("src/Basics/FileIO/Logs/log.txt");

    List<String[]> separatedContent = getSeparateContent(filePath);
    List<String> uniqueIPs = getUniqueIPs(separatedContent);
    double ratio = getGETPOSTRatio(separatedContent);

    //test
    System.out.println("Number of unique IPs: " + uniqueIPs.size());
    System.out.println("GETs/POSTs = " + ratio);
  }

  private static double getGETPOSTRatio(List<String[]> separatedContent) {
    int gets = 0;
    int posts = 0;
    for (String[] line : separatedContent) {
      if (line[2].equals("GET /")) {
        gets++;
      }
      if (line[2].equals("POST /")) {
        posts++;
      }
    }
    return (double) gets / posts;
  }

  private static List<String> getUniqueIPs(List<String[]> separatedContent) {
    List<String> uniqueIPs = new ArrayList<>();
    for (String[] lines : separatedContent) {
      boolean already = false;
      for (String uniqueIP : uniqueIPs) {
        if (lines[1].equals(uniqueIP)) {
          already = true;
          break;
        }
      }
      if (!already) {
        uniqueIPs.add(lines[1]);
      }
    }
    return uniqueIPs;
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
      //System.out.println(separatedLine[1]);
      separatedContent.add(separatedLine);
    }

    return separatedContent;
  }
}
