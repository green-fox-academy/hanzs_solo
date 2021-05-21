package master.engine.tools.matrix;

import master.engine.variables.Position;
import master.gameobjects.GameObject;
import master.gameobjects.tile.tiles.Floor;
import master.gameobjects.tile.tiles.Wall;

public class MatrixLoader {
  public GameObject[][] content;

  public MatrixLoader(char[][] sample, MatrixType matrixType) {
    loadMatrix(sample, matrixType);
  }

  private void loadMatrix(char[][] sample, MatrixType matrixType) {
    content = new GameObject[sample.length][sample.length];
    for (int y = 0; y < sample.length; y++) {
      for (int x = 0; x < sample[y].length; x++) {
        switch (matrixType) {

          case ENVIRONMENT:
            switch (sample[x][y]) {
              case ' ' -> content[x][y] = new Floor(new Position(x, y));
              case 'X' -> content[x][y] = new Wall(new Position(x, y));
              default -> content[x][y] = null;
            }
            break;

          case PICKUP:
            switch (sample[x][y]) {
              //case 'k' -> content[x][y] = new Key(new Position(x, y));
              //case 'h' -> content[x][y] = new HealthBoost(new Position(x, y));
              default -> content[x][y] = null;
            }
            break;
        }
      }
    }
  }
}
