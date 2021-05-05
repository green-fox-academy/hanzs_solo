package engine.executors;

import engine.Screen;
import java.awt.Graphics;

public class Drawer {
  //set reference
  public static Drawer drawer = new Drawer();
  //get references
  static Screen screen = Screen.screen;
  //fields
  int div = 10;
  public int unitSize = screen.size / div;

  public void drawImage(Graphics graphics) {
    System.out.println("hello");
  }

}