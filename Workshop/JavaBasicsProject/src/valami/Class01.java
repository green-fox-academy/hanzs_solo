package valami;

import java.util.Arrays;

//emberszabasu
public class Class01 {
  String name;
  int age;
  boolean isHuman;

  Class01(String name, int age) {
    this.name = name;
    this.age = age;
    isHuman = false;
  }

  public void passTime() {
    age++;
  }
}

