package week_04.AbstractsAndInterfaces.Comparable;


public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  // First compare the first value and then the second
  // the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
  @Override
  public int compareTo(Domino domino) {
    int result = Integer.compare(left,domino.left);
    if(result == 0){
      result = Integer.compare(right,domino.right);
    }
    return result;
  }

//notes:
//  @Override
//  public int compareTo(Domino domino) {
//    if (this.left > domino.left) {
//      return 1;
//    } else if (this.left < domino.left) {
//      return -1;
//    } else {
//      return 0;
//    }
//  }

//  other way:
//  @Override
//  public int compareTo(Domino domino) {
//    return Integer.compare(left,domino.left);
//  }


}