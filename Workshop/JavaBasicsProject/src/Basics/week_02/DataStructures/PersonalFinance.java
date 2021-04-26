package Basics.week_02.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
  public static void main(String[] args) {
    //    We are going to represent our expenses in a list containing integers.
    //
    //    Create a list with the following items.
    //    500, 1000, 1250, 175, 800 and 120
    //    Create an application which solves the following problems.

    List<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

    //    How much did we spend?
    int total = 0;
    for (Integer spent : expenses) {
      total += spent;
    }
    System.out.println("Your total expenses are: " + total);
    //        Which was our greatest expense?
    int greatest = expenses.get(0);
    for (Integer max : expenses) {
      if (max > greatest) {
        greatest = max;
      }
    }
    System.out.println("Your greatest espense was: " + greatest);
    //    Which was our cheapest spending?
    int cheapest = expenses.get(0);
    for (Integer min : expenses) {
      if (min < cheapest) {
        cheapest = min;
      }
    }
    System.out.println("Your cheapest spending was: " + cheapest);

    //     What was the average amount of our spendings?
    int average = total / expenses.size();
    System.out.println("Your average spending was: " + average);

  }


}
