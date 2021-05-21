package week_02.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class ListIntorduction1 {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    System.out.println(names.size());
    names.add("Wiliam");
    System.out.println(names.size() == 0);
    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println(names.get(2));
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }
    for (int i = 0; i < names.size(); i++) {
      System.out.println(i+1+". "+names.get(i));
    }
    names.remove(1);
    for (int i = names.size(); i > 0; i--) {
      System.out.println(names.get(i-1));
    }
    names.clear();
  }
}
