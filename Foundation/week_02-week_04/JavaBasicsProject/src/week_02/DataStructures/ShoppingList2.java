package week_02.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main(String[] args) {
    //  Represent the following products with their prices
    //  Product	Price
    //  Milk	1.07
    //  Rice	1.59
    //  Eggs	3.14
    //  Cheese	12.60
    //  Chicken Breasts	9.40
    //  Apples	2.31
    //  Tomato	2.58
    //  Potato	1.75
    //  Onion	1.10

    Map<String, Double> prices = new HashMap<>() {{
      put("Milk", 1.07);
      put("Rice", 1.59);
      put("Eggs", 3.14);
      put("Cheese", 12.60);
      put("Chicken Breasts", 9.40);
      put("Apples", 2.31);
      put("Tomato", 2.58);
      put("Potato", 1.75);
      put("Onion", 1.10);
    }};

    //  Represent Bob's shopping list
    //  Product	Amount
    //  Milk	3
    //  Rice	2
    //  Eggs	2
    //  Cheese	1
    //  Chicken Breasts	4
    //  Apples	1
    //  Tomato	2
    //  Potato	1
    Map<String, Integer> bobsList = new HashMap<>() {{
      put("Milk", 3);
      put("Rice", 2);
      put("Eggs", 2);
      put("Cheese", 1);
      put("Chicken Breasts", 4);
      put("Apples", 1);
      put("Tomato", 2);
      put("Potato", 1);
    }};

    //  Represent Alice's shopping list
    //  Product	Amount
    //  Rice	1
    //  Eggs	5
    //  Chicken Breasts	2
    //  Apples	1
    //  Tomato	10
    Map<String, Integer> alicesList = new HashMap<>() {{
      put("Rice", 1);
      put("Eggs", 5);
      put("Chicken Breasts", 2);
      put("Apples", 1);
      put("Tomato", 10);
    }};

    //  Create an application which solves the following problems.
    //  How much does Bob pay?
    double total = 0;
    for (String bobsProduct : bobsList.keySet()) {
      for (String product : prices.keySet()) {
        if (bobsProduct == product) {
          total += bobsList.get(bobsProduct) + prices.get(product);
        }
      }
    }
    System.out.println("Bob's expenses are: " + total);
    //  How much does Alice pay?
    for (String alicesProduct : alicesList.keySet()) {
      for (String product : prices.keySet()) {
        if (alicesProduct == product) {
          total += alicesList.get(alicesProduct) + prices.get(product);
        }
      }
    }
    System.out.println("Alice's expenses are: " + total);

    //  Who buys more Rice?
    //  Who buys more Potato?
    String checkProduct = "Tomato";
    if (bobsList.containsKey(checkProduct) && !alicesList.containsKey(checkProduct)) {
      System.out.println("Bob have more " + checkProduct);
    } else if (!bobsList.containsKey(checkProduct) && alicesList.containsKey(checkProduct)) {
      System.out.println("Alice have more " + checkProduct);
    } else if (!bobsList.containsKey(checkProduct) && !alicesList.containsKey(checkProduct)) {
      System.out.println("Nobody have" + checkProduct);
    } else if (bobsList.containsKey(checkProduct) && alicesList.containsKey(checkProduct)) {
      if (bobsList.get(checkProduct) > alicesList.get(checkProduct)) {
        System.out.println("Bob have more " + checkProduct);
      } else {
        System.out.println("Alice have more " + checkProduct);
      }
    }
    //  Who buys more different products?
    if (bobsList.size() > alicesList.size()) {
      System.out.println("Bob have more types of products");
    } else {
      System.out.println("Alice have more types of products");
    }
    //  Who buys more products? (piece)

    int sumAlice = 0;
    for (String currentKey : alicesList.keySet()) {
      sumAlice += alicesList.get(currentKey);
    }
    int sumBob = 0;
    for (String currentKey : bobsList.keySet()) {
      sumBob += bobsList.get(currentKey);
    }
    if (sumBob > sumAlice) {
      System.out.println("Bob have more products");
    } else {
      System.out.println("Alice have more products");
    }

  }
}
