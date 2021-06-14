package com.company.generics;

public class NumberWizard<T> {

  T number;

  public NumberWizard(T number) {
    this.number = number;
  }

  public void multiplyByTwo(){
    System.out.println(number * 2);
  }
}
