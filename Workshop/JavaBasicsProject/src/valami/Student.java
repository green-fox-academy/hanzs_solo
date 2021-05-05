package valami;

public class Student {
  String name;
  int age;
  int missedDays;

  Student(String name){
    this(name,23,0);
  }

  Student(String name, int age, int missedDays){
    this.name = name;
    this.age = age;
    this.missedDays = missedDays;
  }


}
