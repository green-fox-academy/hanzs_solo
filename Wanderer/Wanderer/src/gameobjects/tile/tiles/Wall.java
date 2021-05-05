package gameobjects.tile.tiles;

import engine.variables.Position;
import gameobjects.tile.Tile;

public class Wall extends Tile {

  public Wall(Position position) {
    super(position, true, "wall.png");
  }

}
