package asd;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetMostCommonChars {
  public static void main(String[] args) {
    List<String> strList = new ArrayList<>();
    strList.add("szeretem a kutyákat");
    strList.add("nem szeretem a cicákat");
    System.out.println(strList);



    Map<Character, Integer> allChars = convertStrListToCharacterMapWithValues(strList);

    Map<Character, Integer> mostChars = getMostCommonCharacter(allChars);

    System.out.println(mostChars);
  }

  private static Map<Character, Integer> convertStrListToCharacterMapWithValues(
      List<String> strList) {

    StringBuilder stringBuilder = new StringBuilder();
    for (String line : strList) {
      stringBuilder.append(line);
    }

    String str = stringBuilder.toString();

    char[] chars = str.toCharArray();

    Map<Character, Integer> characterAmountMap = new HashMap<>();

    for (char ch : chars) {
      if (!characterAmountMap.containsKey(ch)) {
        characterAmountMap.put(ch, 1);
      } else {
        characterAmountMap.put(ch, characterAmountMap.get(ch) + 1);
      }
    }

    return characterAmountMap;
  }

  public static Map<Character, Integer> getMostCommonCharacter(
      Map<Character, Integer> characterAmountMap) {

    char charWithMaxValue = ' ';
    int maxValue = 0;

    char charWithSecondMaxValue = ' ';
    int secondMaxValue = 0;

    for (Character key : characterAmountMap.keySet()) {
      int thisKeyValue = characterAmountMap.get(key);

      if (thisKeyValue > maxValue) {
        charWithMaxValue = key;
        maxValue = characterAmountMap.get(key);
      } else if (thisKeyValue > secondMaxValue) {
        charWithSecondMaxValue = key;
        secondMaxValue = characterAmountMap.get(key);
      }
    }

    Map<Character, Integer> result = new HashMap<>();
    result.put(charWithMaxValue, maxValue);
    result.put(charWithSecondMaxValue, secondMaxValue);

    System.out.println(result);

    return result;
  }
}
