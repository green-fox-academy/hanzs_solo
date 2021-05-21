package week_03.Recursion;

public class Power {
  // Given base and n that are both 1 or more, compute recursively (no loops) the
  // value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  public static void main(String[] args) {
    int base = 10;
    int n = 3;
    System.out.println(power(base, n));
  }

  private static int power(int base, int n) {
    if (n > 0) {
      return base * power(base, n - 1);
    }
    return 1;
  }
}
