package master.engine.tools;

import master.engine.variables.Position;

public class Converter {

  public static Position positionConverter(Position position, int size) {
    Position unitCenter = getUnitCenter(position);
    Position positionInPixel = new Position(position.x, position.y);
    positionInPixel.x = unitCenter.x-size/2;
    positionInPixel.y = unitCenter.y-size/2;
    return positionInPixel;
  }

  private static double toPixel(double coordinate) {
    return Values.UNIT_SIZE.value * coordinate;
  }

  private static Position getUnitCenter(Position position) {
    Position unitCenter = new Position();
    unitCenter.x = position.x * Values.UNIT_SIZE.value + Values.UNIT_SIZE.value / 2;
    unitCenter.y = position.y * Values.UNIT_SIZE.value + Values.UNIT_SIZE.value / 2;
    return unitCenter;
  }

}
