package streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Excercises {
  public static void main(String[] args) {
//    Exercise 1
//    Write a Stream Expression to get the even numbers from the following list:
    List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> result1 = numbers1
        .stream()
        .filter(x -> x % 2 == 0)
        .collect(Collectors.toList());

    System.out.println(result1);

//    Exercise 2
//    Write a Stream Expression to get the squared value of the positive numbers from the following list:
    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> result2 = numbers2
        .stream()
        .map(x -> x * x)
        .collect(Collectors.toList());

    System.out.println(result2);

//    Exercise 3
//    Write a Stream Expression to find which number squared value is more then 20 from the following list:
    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> result3 = numbers3
        .stream()
        .map(x -> x * x)
        .filter(x -> x > 20)
        .sorted()
        .collect(Collectors.toList());

    System.out.println(result3);

//    Exercise 4
//    Write a Stream Expression to get the average value of the odd numbers from the following list:
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    double result4 = numbers4
        .stream()
        .filter(x -> x % 2 != 0)
        .mapToDouble(x -> x)
        .average()
        .orElse(0);

    System.out.println(result4);

//    Exercise 5
//    Write a Stream Expression to get the sum of the odd numbers in the following list:
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    int result5 = numbers5
        .stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(x -> x)
        .sum();

    System.out.println(result5);

//    Exercise 6
//    Write a Stream Expression to find the uppercase characters in a string!
    String str1 = "Write a Stream Expression to find the uppercase characters in a string!";

    List<Character> result6 = str1.chars()
        .filter(Character::isUpperCase)
        .mapToObj(x -> (char) x)
        .collect(Collectors.toList());

    System.out.println(result6);


//        Exercise 7
//    Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    String letter = "A";

    List<String> result7 = cities.stream()
        .filter(x -> x.startsWith(letter))
        .collect(Collectors.toList());

    System.out.println(result7);

//    Exercise 8
//    Write a Stream Expression to concatenate a Character list to a string!

    Random random = new Random();

    List<Character> randomCharList = random
        .ints(10, 0, 256) //returns with a 10 long stream with random numbers from 0 to 255
        .mapToObj(x -> (char) x)
        .collect(Collectors.toList());

    System.out.println("Generated charlist: " + randomCharList);

    String result8 = randomCharList
        .stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
    System.out.println(result8);


//        Exercise 9
//    Write a Stream Expression to find the frequency of characters in a given string!
    String str2 =
        "Write a Stream Expression to find the frequency of characters in a given string!";

    Map<Character, Long> result9 = str2.chars()
        .mapToObj(x -> (char) x)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(result9);

//        Exercise 10
//    Create a streams.Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//    Write a Stream Expression to find the foxes with green color!
//        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//        Write a Stream Expression to find the frequency of foxes by color!
    List<Fox> foxes = createFoxes();

    List<Fox> result10a = foxes
        .stream()
        .filter(x -> x.getColor().equals("green"))
        .filter(x -> x.getAge() < 5)
        .collect(Collectors.toList());

    System.out.println(result10a);

    Map<String, List<Fox>> result10b = foxes.stream()
        .collect(Collectors.groupingBy(Fox::getColor));

    System.out.println(result10b);
    System.out.println("==========================================================");

//    Exercise 11 💪
//    Find a random Wikipedia article and copy the contents to a txt file.
//        Create a Stream expression which reads all text from this file,
//        and prints the 100 most common words in descending order.
//    Keep in mind that the text contains punctuation characters which should be ignored.

    Path wikiPath = Paths.get("src/streams/wiki.txt");

    String content = "";

    try {
      content = Files.readString(wikiPath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }

    content = content.replaceAll("\\p{Punct}", "");
    content = content.replaceAll("\t", " ");
    content = content.replaceAll("\r\n", " ");

    System.out.println(content);
    List<String> words = Arrays.asList(content.split(" "));

    Map<String, Long> collect = words.stream()
        .filter(x -> !x.equals(""))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//    Map<String, Long> result11 = collect.entrySet()
//        .stream()
//        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//        .limit(100)
//        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    LinkedHashMap<String, Long> result11 = collect.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(100)
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,(v1, v2) -> {
              throw new IllegalStateException();
              },
            LinkedHashMap::new ));

    System.out.println(result11);
  }

  private static List<Fox> createFoxes() {
    List<Fox> result = new ArrayList<>();
    result.add(new Fox("fox1", "black", 11));
    result.add(new Fox("fox2", "green", 7));
    result.add(new Fox("fox3", "yellow", 60));
    result.add(new Fox("fox4", "green", 3));
//        .map(x -> x.replace(",", ""))
//        .map(x -> x.replace(":", ""))
//        .map(x -> x.replace(";", ""))
//        .map(x -> x.replace("(", ""))
//        .map(x -> x.replace(")", ""))
//        .map(x -> x.replace("!", ""))
//        .map(x -> x.replace("?", ""))
//        .map(x -> x.replace("!", ""))
    result.add(new Fox("fox5", "green", 4));
    result.add(new Fox("fox6", "black", 1));
    result.add(new Fox("fox7", "yellow", 2));

    return result;

//    Exercise 12 💪💪
//    The swcharacters.csv file contains the list of characters appeared in the Star Wars universe.
//
//    "BBY" stands for Before the Battle of Yavin, it's the "year zero" in the Galactic Standard Calendar.
//    For the age calculation let's assume that it's "year zero" and every character lives for the sake of simplicity.
//
//    Create Stream expressions to perform the following exercises:
//
//    Print the name of the heaviest character (if the mass is unknown, ignore that character)
//    Print the average height of the male characters
//    Print the average height of the female characters
//💪 Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
//    The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
//    The result should be a Map<String, Map<String, Integer>>

  }
}
