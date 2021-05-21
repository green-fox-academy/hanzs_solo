package week_02.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args) {
    //    We are going to represent a shopping list in a list containing strings.
    //
    //    Create a list with the following items.
    //    Eggs, milk, fish, apples, bread and chicken
    List<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
    //    Create an application which solves the following problems.
    //    Do we have milk on the list?
    System.out.println(shoppingList.contains("milk"));
    //    Do we have bananas on the list?
    System.out.println(shoppingList.contains("bananas"));
  }
}
