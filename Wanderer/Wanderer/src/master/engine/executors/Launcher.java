package master.engine.executors;

import master.engine.Screen;

public class Launcher {
  static Screen screen;
  Drawer drawer;

  public void StartGame() {
    drawer = new Drawer();
    screen = new Screen(drawer);
    screen.setScreen();
  }
}
