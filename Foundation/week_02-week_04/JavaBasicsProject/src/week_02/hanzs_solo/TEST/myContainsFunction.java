package week_02.hanzs_solo.TEST;

public class myContainsFunction {
  public static void main(String[] args) {

    //Search character in String
    String text1 = "korte";
    char text2 = 'r';

    System.out.println(contains(text1, text2));

    //Search String in String


  }

  public static boolean contains(String a, char b) {

    char[] aCharArray = a.toCharArray();

    for (int i = 0; i < aCharArray.length; i++) {
      if (aCharArray[i] == b) {
        return true;
      }
    }
    return false;
  }

}
