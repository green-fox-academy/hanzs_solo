package master.gameobjects.tile.tiles;
import master.engine.variables.Position;
import master.gameobjects.tile.Tile;

public class Wall extends Tile {

  public Wall(Position position) {
    super(position, true, "wall.png");
  }

}
