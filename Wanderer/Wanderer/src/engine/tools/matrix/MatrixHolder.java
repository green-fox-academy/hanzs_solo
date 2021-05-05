package engine.tools.matrix;

public class MatrixHolder {

  public char[][] simpleFloorMatrix() {
    // ' ' - floor
    // 'X' - wall
    return new char[][] {
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    };
  }

  public static char[][] wallMatrix() {
    // ' ' - floor
    // 'X' - wall
    return new char[][] {
        {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
        {'X', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},
        {'X', ' ', ' ', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
        {'X', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X'},
        {'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', ' ', 'X'},
        {' ', ' ', 'X', 'X', 'X', ' ', ' ', 'X', ' ', 'X'},
        {'X', ' ', ' ', ' ', 'X', ' ', 'X', 'X', ' ', 'X'},
        {'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X'},
        {'X', ' ', ' ', ' ', 'X', ' ', 'X', ' ', ' ', 'X'},
        {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
    };
  }

  public static char[][] pickupMatrix() {
    // 'h' - health boost
    // 'k' - key
    return new char[][] {
        {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
        {'X', ' ', 'h', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},
        {'X', ' ', ' ', 'X', ' ', 'X', 'X', 'X', ' ', 'X'},
        {'X', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', 'X'},
        {'X', 'X', 'X', 'X', 'X', 'X', ' ', 'X', ' ', 'X'},
        {' ', ' ', 'X', 'X', 'X', ' ', 'h', 'X', ' ', 'X'},
        {'X', 'e', ' ', ' ', 'X', ' ', 'X', 'X', ' ', 'X'},
        {'X', 'e', 'B', ' ', ' ', ' ', 'X', 'h', ' ', 'X'},
        {'X', ' ', 'e', ' ', 'X', ' ', 'X', 'k', ' ', 'X'},
        {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
    };
  }
}
