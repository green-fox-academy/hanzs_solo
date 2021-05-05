package gameobjects.tile.tiles;

import engine.variables.Position;
import gameobjects.tile.Tile;

public class Floor extends Tile {

  public Floor(Position position) {
    super(position, false, "floor.png");
  }

}
