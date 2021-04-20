package Basics.DataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  public static void main(String[] args) {
    Map<String, String> phoneBook = new HashMap<>();
    phoneBook.put("William A. Lathan","405-709-1865");
    phoneBook.put("John K. Miller","402-247-8568");
    phoneBook.put("Hortensia E. Foster","606-481-6467");
    phoneBook.put("Amanda D. Newland","319-243-5613");
    phoneBook.put("Brooke P. Askew","307-687-2982");

    //    What is John K. Miller's phone number?
    System.out.println(phoneBook.get("John K. Miller"));
    //    Whose phone number is 307-687-2982?

    for (String currentKey: phoneBook.keySet()) {
      if (phoneBook.get(currentKey).equals("307-687-2982")){
        System.out.println(currentKey);
      }
    }

    //    Do we know Chris E. Myers' phone number?
    System.out.println(phoneBook.containsKey("Chris E. Myer"));

  }

}
