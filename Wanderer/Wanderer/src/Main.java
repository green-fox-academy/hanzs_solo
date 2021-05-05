import engine.executors.Drawer;
import engine.Screen;
import engine.variables.Position;

public class Main {
  //get references
  static Drawer drawer = Drawer.drawer;
  static Screen screen = Screen.screen;

  public static void main(String[] args) {
    screen.setScreen();
  }

  public static void onKeyPress(Position movementInput, char pressedKey){
    screen.repaint();
  }

}