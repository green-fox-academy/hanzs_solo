package master;

import javax.swing.text.Position;
import master.engine.executors.Launcher;

public class Main {
  //get references

  public static void main(String[] args) {
    Launcher launcher = new Launcher();
    launcher.StartGame();

  }

  public static void onKeyPress(Position movementInput, char pressedKey){

  }
}