package engine.tools;

import engine.executors.Drawer;
import engine.variables.Position;

public class Converter {
  static Drawer drawer = Drawer.drawer;

  public static Position positionConverter(Position position) {
    Position positionInPixel = new Position(position.x, position.y);
    positionInPixel.x = toPixel(positionInPixel.x);
    positionInPixel.y = toPixel(positionInPixel.y);
    return positionInPixel;
  }

  private static int toPixel(int coordinate) {
    return drawer.unitSize * coordinate;
  }

}
