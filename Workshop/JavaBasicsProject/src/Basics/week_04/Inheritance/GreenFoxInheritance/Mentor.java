package Basics.week_04.Inheritance.GreenFoxInheritance;
//Mentor
//
//    Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
//
//    fields:
//    level: the level of the mentor (junior / intermediate / senior)
//
//    methods:
//    getGoal(): prints "Educate brilliant junior software developers."
//    introduce(): prints "Hi, I'm name, a age year old gender level mentor."
//
//    The Mentor class has the following constructors:
//
//    Mentor(name, age, gender, level)
//    Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate

//
//Class
//subclass of Person
public class Mentor extends Person {
  //
  //fields
  private String level;

  //
  //constructors
  public Mentor() {
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.setLevel(level);
  }

  //
  //methods
  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() +
            " " + this.level + " mentor.");
  }


  //
  //getters and setters
  private void setLevel(String level) {
    if (level.equals("junior") || level.equals("intermediate") || level.equals("senior")) {
      this.level = level;
    } else{
      throw new IllegalArgumentException("You must choose between \"junior\", \"intermediate\" and \"senior\"!");
    }
  }
}
