package Basics.OO.Counter;

//  Create Counter class
//  which has a counter (integer) field
//  at creation it should have a default value 0 or can be specified by a parameter
//  we can add another whole number to this counter: add(number)
//  we can just increase the counter's value by one: add() (no parameters)
//  we can get() the current counter value
//  and we can reset() the counter to the initial value


public class Counter {
  Integer counter = 0;
  Integer initialValue = counter;

  public Counter() {
  }

  public Counter(Integer counter) {
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

