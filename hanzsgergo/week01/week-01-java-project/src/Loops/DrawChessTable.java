package Loops;

public class DrawChessTable {

  public static void main(String[] args) {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //

    System.out.println("Chess table: ");
    //Rows
    for (int r = 0; r <= 8; r++) {

      //columns
      if (r % 2 != 0) {
        for (int c = 1; c <= 8; c++) {
            if (c % 2 == 0) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
      } else {
        for (int c = 1; c <= 8; c++) {
            if (c % 2 != 0) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
      }
      System.out.println();

    }
  }
}
