package Basics.FileIO.Lottery;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

    String fileName = "lottery.csv";
    doStuff(fileName);

  }

  private static void doStuff(String fileName) {
    Path filePath = Paths.get("src/Basics/FileIO/Lottery/" + fileName);
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

    List<String> allNumbers = putAllNumbersInOneList(separatedContent); //btw its 15325 numbers :)
    findFiveMostCommon(allNumbers);

  }

  private static List<String> putAllNumbersInOneList(List<String[]> separatedContent) {
    List<String> allNumbers = new ArrayList<>();

    for (String[] lines : separatedContent) {
      allNumbers.addAll(Arrays.asList(lines).subList(11, 16));
    }
    return allNumbers;
  }

  private static void findFiveMostCommon(List<String> allNumbers) {
    List<Integer[]> numbersWithFrequency = new ArrayList<>();

    //save out number-frequency pairs
    for (int i = 1; i <= 90; i++) {
      Integer[] tempArray = {i, Collections.frequency(allNumbers, String.valueOf(i))};
      numbersWithFrequency.add(tempArray);
    }
    //sorting
    //version 1 (sima)
//    numbersWithFrequency.sort(new Comparator<Integer[]>() {
//      public int compare(Integer[] egyik, Integer[] masik) {
//        return egyik[1].compareTo(masik[1]);
//      }
//    });

    //version 2 (lambda vagy mi)
//    numbersWithFrequency.sort((egyik, masik) -> egyik[1].compareTo(masik[1]));

    //version 3 (baszógép)
    numbersWithFrequency.sort(Comparator.comparing(valami -> valami[1]));

    //saving data
    String fiveMostCommon = numbersWithFrequency.get(89)[0] + " " +
        numbersWithFrequency.get(88)[0] + " " +
        numbersWithFrequency.get(87)[0] + " " +
        numbersWithFrequency.get(86)[0] + " " +
        numbersWithFrequency.get(85)[0];
    System.out.println(fiveMostCommon);
  }
}