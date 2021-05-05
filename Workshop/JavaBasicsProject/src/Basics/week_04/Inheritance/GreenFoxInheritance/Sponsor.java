package Basics.week_04.Inheritance.GreenFoxInheritance;


/**
 * Sponsor
 * <p>
 * Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional
 * <p>
 * fields:
 * company: name of the company
 * hiredStudents: number of students hired
 * <p>
 * method:
 * introduce(): prints "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
 * hire(): increases hiredStudents by 1
 * getGoal(): prints "Hire brilliant junior software developers."
 * <p>
 * The Sponsor class has the following constructors:
 * Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
 * Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
 */

//subclass of Person
public class Sponsor extends Person {
  //
  //fields
  private final String company;
  private int hiredStudents;

  //
  //constructors
  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  //
  //methods
  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() +
            " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  //
  //getters and setters

}
