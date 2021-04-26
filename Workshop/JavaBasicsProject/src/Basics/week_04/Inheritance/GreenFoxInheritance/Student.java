package Basics.week_04.Inheritance.GreenFoxInheritance;
//Student
//
//    Create a Student class that has the same fields and methods as the Person class, and has the following additional
//
//    fields:
//    previousOrganization: the name of the student’s previous company / school
//    skippedDays: the number of days skipped from the course
//
//    methods:
//    getGoal(): prints "Be a junior software developer."
//    introduce(): prints "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//    skipDays(numberOfDays): increases skippedDays by numberOfDays
//
//    The Student class has the following constructors:
//
//    Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//    Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0

//
//Class
//subclass of Person
public class Student extends Person {
  //
  //fields
  private String previousOrganization;
  private int skippedDays;

  //
  //constructors
  Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  //
  //methods
  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + " , a " + this.getAge() + " year old " + this.getGender() +
            " from " + this.previousOrganization + " who " + this.skippedDays +
            " days from the course already.");
  }

  //
  //getters and setters
  public void setSkippedDays(int skippedDays) {
    if (skippedDays >= 0) {
      this.skippedDays = skippedDays;
    }else {
      throw new IllegalArgumentException("skippedDays can't be a negative number");
    }
  }
}