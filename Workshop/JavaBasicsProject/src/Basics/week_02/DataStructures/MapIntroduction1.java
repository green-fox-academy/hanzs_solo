package Basics.week_02.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
  public static void main(String[] args) {
    Map<Integer,String> newMap = new HashMap<>();
    System.out.println(newMap.size());
    newMap.put(97,"a");
    newMap.put(98,"b");
    newMap.put(99,"c");
    newMap.put(65,"A");
    newMap.put(66,"B");
    newMap.put(67,"C");
    System.out.println(newMap.keySet());
    System.out.println(newMap.values());
    newMap.put(68,"D");
    System.out.println(newMap.size());
    System.out.println(newMap.get(99));
    newMap.remove(97);
    System.out.println(newMap.containsKey(100));
    newMap.clear();
  }
}
