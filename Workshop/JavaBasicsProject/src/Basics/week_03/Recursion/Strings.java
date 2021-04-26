package Basics.week_03.Recursion;

public class Strings {
  // Given a string, compute recursively (no loops) a new string where
  // all the lowercase 'x' chars have been changed to 'y' chars.

  public static void main(String[] args) {
    String text = "xyzZyXxyz";
    int n = text.length();

    //stupidXChanger(text);
    System.out.println(smartReplacer(text));
    //System.out.println(smartXChanger(text));
  }


  //Dávid megoldása
  private static String smartReplacer(String input) {
    if (input.length() == 1) {
      if (input.equals("x")) {
        return "y";
      } else {
        return input;
      }
    } else if (input.charAt(0) == 'x') {
      return "y" + smartReplacer(input.substring(1));
    } else {
      return input.charAt(0) + smartReplacer(input.substring(1));
    }
  }

  private static String smartXChanger(String text) {
    return text.replace('x','y');
  }
}
