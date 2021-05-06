package master.gameobjects.tile.tiles;

import master.engine.variables.Position;
import master.gameobjects.tile.Tile;

public class Floor extends Tile {

  public Floor(Position position) {
    super(position, false, "floor.png");
  }

}
