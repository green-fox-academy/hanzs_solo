package week_03.OO.Counter;

//  Create Counter class
//  which has a counter (integer) field
//  at creation it should have a default value 0 or can be specified by a parameter
//  we can add another whole number to this counter: add(number)
//  we can just increase the counter's value by one: add() (no parameters)
//  we can get() the current counter value
//  and we can reset() the counter to the initial value


public class Counter {
  private int counter = 0;
  private int initialValue = counter;

  Counter() {
  }

  Counter(int counter) {
    this.counter = counter;
    this.initialValue = counter;
  }

  public void add() {
    this.counter++;
  }

  public void add(int number) {
    this.counter += number;
  }

  public Integer get() {
    return counter;
  }

  public void reset() {
    counter = initialValue;
  }
}

