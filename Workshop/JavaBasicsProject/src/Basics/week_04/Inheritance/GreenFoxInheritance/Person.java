package Basics.week_04.Inheritance.GreenFoxInheritance;

//    Create a Person class with the following fields:
//
//    name: the name of the person
//    age: the age of the person (whole number)
//    gender: the gender of the person (male / female)

//    And the following methods:
//
//    getGoal(): prints "My goal is: Live for the moment!"
//    introduce(): prints "Hi, I'm name, a age year old gender."

//    And the following constructors:
//
//    Person(name, age, gender)
//    Person(): sets name to Jane Doe, age to 30, gender to female


//
//Class
//superclass
public class Person {
  //
  //fields
  private String name;
  private int age;
  private String gender;

  //
  //constructors
  Person() {
    this.name = "Jane Doe";
    setAge(30);
    setGender("female");
  }

  Person(String name, int age, String gender) {
    this.name = name;
    setAge(age);
    setGender(gender);

  }

  //
  //methods
  public void getGoal() {
    System.out.println("My goal is: Live for the moment.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
  }

  //
  //getters and setters
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      throw new IllegalArgumentException("You must set the age above 0!");
    }
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    if (gender.equals("female") || gender.equals("male")) {
      this.gender = gender;
    } else {
      throw new IllegalArgumentException("You must set the gender to \"Female\" or \"Male\"!");
    }
  }
}
