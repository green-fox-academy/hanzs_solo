package week_02.Functions;

    //  Create the usual class wrapper and main method on your own
public class AppendA {
  public static void main(String[] args) {

    // - Create a string variable named `typo` and assign the value `Chinchill` to it
    String typo = "Chincill";

    // - Print the result of `appendA(typo)`
    System.out.println(appendA(typo));
  }

    // - Write a function called `appendA()` that gets a string as an input,
    //   appends an 'a' character to its end and returns the modified string
    //
  public static String appendA(String text){
    String result = text + "a";
    return result;
  }
}
