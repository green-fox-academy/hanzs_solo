package week_04.AbstractsAndInterfaces.Cloneable;

public class Main {
  public static void main(String[] args) {
    Person ember = new Person("Erik",25,"male");
    Person attila = (Person) ember.clone();

    System.out.println(ember.getName());
    System.out.println(attila.getName());
  }
}
