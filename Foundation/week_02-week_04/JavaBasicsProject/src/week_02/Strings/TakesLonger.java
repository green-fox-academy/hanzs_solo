package week_02.Strings;

public class TakesLonger {
  public static void main(String[] args) {

    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String insertion = "always takes longer than";

    int yIndex = quote.indexOf("y");
    String part1 = quote.substring(0,yIndex);
    String part2 = quote.substring(yIndex-1);

    StringBuilder sb = new StringBuilder();

    sb.append(part1).append(insertion).append(part2);
    System.out.println(sb);
  }

}
