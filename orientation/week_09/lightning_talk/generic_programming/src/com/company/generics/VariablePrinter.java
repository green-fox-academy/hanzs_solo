package com.company.generics;

import java.util.Map;

public class VariablePrinter<T, V> {

  T variable;
  V variable2;

  public VariablePrinter(T variable, V variable2) {
    this.variable = variable;
    this.variable2 = variable2;
  }

  public void print(){
    System.out.println(variable);
    System.out.println(variable2);
  }
}
