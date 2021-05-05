package valami;

import Basics.week_04.Testing.Sum.Task.Sum;

public class Class02 extends Class01 {

  String favouriteToy;

  Class02(String name, int age, String favouriteToy){
    super(name,age);
    this.favouriteToy = favouriteToy;
  }
  Class02(String name, int age){
    super(name,age);
    favouriteToy = "csirkefarhat";
  }


  public void play() {
    System.out.println("playing with " + favouriteToy);
  }
  public void printAll() {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.isHuman);
    System.out.println(this.favouriteToy);
  }
}
