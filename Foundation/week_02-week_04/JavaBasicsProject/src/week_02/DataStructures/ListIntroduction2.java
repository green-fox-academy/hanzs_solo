package week_02.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {

    List<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
    List<String> listB = new ArrayList<>();

    for (int i = 0; i < listA.size(); i++) {
      listB.add(listA.get(i));
    }
    System.out.println(listA.contains("Durian"));
    listB.remove("Durian");
    listA.add(4, "Kiwifruit");
    System.out.println(listA);
    boolean aIsBigger = listA.size() > listB.size();
    int indexOfAvocadoInA = listA.indexOf("Avocado");
    int indexOfDurianInB = listB.indexOf("Durian");
    listB.addAll(Arrays.asList("PassionFruit", "Pomelo"));
    System.out.println(listA.get(2));

  }

}
