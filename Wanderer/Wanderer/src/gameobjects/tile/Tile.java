package gameobjects.tile;

import engine.variables.Position;
import gameobjects.GameObject;

public abstract class Tile extends GameObject {
  boolean wallType;

  public Tile(Position position, boolean wallType, String fileName) {
    super(position, "tiles/" + fileName);
    this.wallType = wallType;
  }

}
