package valami;

public class Main {
  String mainFieldje;

  public void main(String[] args) {
    Class03 majom = new Class03("csita", 5, "kutya", true);
//    majom.age = 3;
//    majom.name = "csita";
//    majom.canRead = true;
//    majom.favouriteToy = "cica";
//    majom.isHuman = false;

    System.out.println(majom.age);
    majom.play();
    majom.passTime();
    System.out.println(majom.age);
    System.out.println(majom.canRead);
    System.out.println(majom.isHuman);

    this.mainFieldje = "asd";
    majom.passTime();
  }

  Main() {
  }
}
