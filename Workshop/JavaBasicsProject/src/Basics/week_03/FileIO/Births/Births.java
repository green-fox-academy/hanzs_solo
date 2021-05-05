package Basics.week_03.FileIO.Births;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Births {
  // Create a function that
  // - takes the name of a CSV file as a parameter,
  //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
  // - and returns the year when the most births happened.
  //   - if there were multiple years with the same number of births then return any of them

  // You can find such a CSV file in this directory named births.csv
  // If you pass "births.csv" to your function, the result should be either 2006 or 2016


  public static void main(String[] args) {
    String fileName = "births.csv";
    doIt(fileName);

  }

  private static void doIt(String fileName) {
    Path filePath = Paths.get("src/Basics/FileIO/Births/" + fileName);
    List<String> content = new ArrayList<>();

    try {
      content = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }


    List<String[]> separatedContent = new ArrayList<>();
    for (String line : content) {
      separatedContent.add(line.split(";"));
    }

    List<String> years = getYears(separatedContent);
    List<String> uniqueYears = getUniqueYears(years);
    System.out.println(mostBirths(years, uniqueYears));
  }

  private static String mostBirths(List<String> years, List<String> uniqueYears) {
    int most = 0;
    String mostBirthsIn = "";
    for (String uniqueYear : uniqueYears) {
      int amount = 0;
      for (String year : years) {
        if (uniqueYear.equals(year)) {
          amount++;
        }
      }
      if (amount > most) {
        most = amount;
        mostBirthsIn = uniqueYear;
      }
    }
    return mostBirthsIn;
  }

  private static List<String> getYears(List<String[]> separatedContent) {
    List<String> years = new ArrayList<>();

    for (String[] date : separatedContent) {
      years.add(date[1].substring(0, 4));
    }
    return years;
  }

  private static List<String> getUniqueYears(List<String> years) {
    List<String> uniqueYears = new ArrayList<>();
    for (String year : years) {
      boolean already = false;
      for (String uniqueYear : uniqueYears) {
        if (year.equals(uniqueYear)) {
          already = true;
          break;
        }
      }
      if (!already) {
        uniqueYears.add(year.substring(0, 4));
      }
    }
    return uniqueYears;
  }
}
