package week_04.AbstractsAndInterfaces.CharSequence;

/**
 * -Create a ShiftedCharSequence class implementing this interface
 * -This CharSequence can be constructed using the following arguments:
 * -a String (that is to be shifted)
 * -a number (which defines how many characters to shift)
 * -Implement the methods so that the sequence is shifted by the defined number of characters
 */

public class ShiftedCharSequence implements CharSequence {
  //
  // fields
  private final String text;

  //
  // constructors
  public ShiftedCharSequence(String text, int number) {
    //example -> ampleex
    this.text = text.substring(number) + text.substring(0, number);
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
