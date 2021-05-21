package week_02.ExpressionsAndControlFlow.Loops;

public class IWontCheatOnExams {
  public static void main(String[] args) {
    // Create a program that writes this line 100 times:
    // "I won't cheat on the exam!"


    //For loop
    for (int i = 0; i < 100; i++) {
      System.out.println(i + 1 + " I won't cheat on the exam!");
    }

    //While loop
    int i = 0;
    while (i < 100) {
      System.out.println(i + 1 + " I won't cheat on the exam!");
      i++;
    }
  }
}
