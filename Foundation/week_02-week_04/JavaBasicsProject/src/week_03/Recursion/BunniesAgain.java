package week_03.Recursion;

public class BunniesAgain {
  // We have bunnies standing in a line,
  // numbered 1, 2, 3, 4, ...
  // The odd bunnies (1, 3, ...) have the normal 2 ears.
  // The even bunnies (2, 4, ..) we'll say have 3 ears,
  // because they each have a raised foot.
  // Recursively return the number of "ears" in
  // the bunny line 1, 2, ... n (without loops or multiplication).
  public static void main(String[] args) {
    int n = 10;

    System.out.println(countEars(n));
  }

  private static int countEars(int n) {
    if (n > 0) {
      if (n % 2 == 0) {
        return 3 + countEars(n - 1);
      } else {
        return 2 + countEars(n - 1);
      }
    }
    return 0;
  }
}
