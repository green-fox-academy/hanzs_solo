package valami;

public class Class03 extends Class02 {
  boolean canRead;

  Class03(String name, int age, String favourtiteToy, boolean canRead) {
    super(name, age, favourtiteToy);
    this.canRead = canRead;
  }

  Class03(String name, int age) {
    super(name,age);
    System.out.println("asd");
  }


  public static void main(String[] args) {
  Class02 ilyen = new Class02("csita", 5, "kacsa");
    Class03 olyan = new Class03("charlie", 7);

    ilyen.printAll();
    olyan.printAll();

  }
  @Override
  public void printAll() {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.isHuman);
    System.out.println(this.favouriteToy);
    System.out.println(this.canRead);
  }



}
