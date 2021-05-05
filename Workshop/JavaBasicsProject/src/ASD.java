import java.awt.event.KeyEvent;

public class ASD {
  public static void main(String[] args) {
    System.out.println(method2());


  }
  void keyListener(KeyEvent e){

  }
  public static void method1() {

  }

  public static boolean method2() {
    boolean is5Divisor = false;
    for (int i = 0; i < 10; i++) {
      if (i % 5 == 0) {
        is5Divisor = true;
        break;
      } else {
        is5Divisor = false;
      }
    }
    return is5Divisor;
  }

  //
  // 00,01,02
  // 10,11,12
  // 20,21,22
  //
  // 00,01,02,03
  // 10,11,12,13
  // 20,21,22,23
  //

}
