package master.engine.executors;

import master.engine.Screen;
import master.engine.variables.Position;
import master.gameobjects.character.characters.Hero;

public class Launcher {
  static Screen screen;
  static Drawer drawer;
  static Hero hero;

  public void StartGame() {
    drawer = new Drawer();
    screen = new Screen(drawer);
    hero = new Hero(new Position(1,1));
    screen.setScreen();
  }
}
