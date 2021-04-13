package Functions;

public class AppendA {
  public static void main(String[] args) {
    //  Create the usual class wrapper and main method on your own

    // - Create a string variable named `typo` and assign the value `Chinchill` to it
    String typo = "Chincill";
    // - Write a function called `appendA()` that gets a string as an input,
    //   appends an 'a' character to its end and returns the modified string
    //

    // - Print the result of `appendA(typo)`
    System.out.println(AppendA(typo));
  }
  public static String AppendA(String text){
    String result = text + "a";
    return result;
  }
}
