package master.gameobjects.tile;

import master.engine.variables.Position;
import master.gameobjects.GameObject;

public abstract class Tile extends GameObject {
  boolean wallType;

  public Tile(Position position, boolean wallType, String fileName) {
    super(position, "tiles/" + fileName);
    this.wallType = wallType;
  }

}
