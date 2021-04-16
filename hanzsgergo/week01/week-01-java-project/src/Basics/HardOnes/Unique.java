package Basics.HardOnes;

public class Unique {
  public static void main(String[] args) {

    //  Example
//    System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    int[] numbers = {1, 11, 34, 11, 52, 61, 1, 34};
    findUniqueItems(numbers);

  }

    //  Create a function that takes an array of numbers as a parameter
    //  and returns an array of integers where every integer is unique (occurs only once)
  public static void findUniqueItems(int[] original) {
    
    int[] simple = new int[original.length];
    int stayHere = 0;

    for (int i = 0; i < original.length; i++) {
      int currentNumber = original[i];

    }







    
//    for (int i = 0; i < original.length; i++) {
//      simple[i-stayHere] = original[i];
//      for (int j = 0; j < i; j++) {
//        if (simple[i-stayHere] == original[j]) {
//          stayHere++;
//        }
//      }
//    }
//    System.out.println(Arrays.toString(original));
//    System.out.println(Arrays.toString(simple));
//
//    System.out.println(stayHere);
//    int fixLenght = simple.length;
//
//    System.out.println(fixLenght);
//    int[] fixed = new int[fixLenght];
//
//    for (int i = 0; i < fixLenght; i++) {
//      fixed[i] = simple[i];
//    }
//
//    System.out.println(Arrays.toString(fixed));
  }

}
