package master.engine.variables;

public class Position {
  public int x;
  public int y;

  public Position() {
    this(0, 0);
  }

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Position addPosition(Position pos) {
    Position result = new Position();

    result.x = this.x + pos.x;
    result.y = this.y + pos.y;

    return result;
  }

  @Override
  public String toString() {
    return "[x: " + x + ", y: " + y+"]";
  }
}
