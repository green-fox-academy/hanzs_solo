package Basics.week_04.AbstractsAndInterfaces.CharSequence;

//-Create a Gnirts class implementing this interface
//    -It should have one String field that can be set via the constructor
//    -Your solution should be a class that represents a reversed String. Implement its methods accordingly. E.g. if the Gnirts is constructed with the String "example" then the character at the 2nd index is 'p'
//    -In a main method try out all the methods

public class Gnirts implements CharSequence {

  //
  //fields
  private String text;

  //
  //constructors
  Gnirts(String string) {
    this.text = new StringBuilder(string).reverse().toString();
  }

  //
  // methods

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.text.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  //
  // getters and setters
  public String getText() {
    return text;
  }
}
