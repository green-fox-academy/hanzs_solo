package master.engine.executors;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import master.engine.variables.Position;
public class InputHandler implements KeyListener {
  Position movementInput = new Position();
  char pressedKey;

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_UP:
      case KeyEvent.VK_W:
        movementInput.y = -1;
        break;
      case KeyEvent.VK_DOWN:
      case KeyEvent.VK_S:
        movementInput.y = 1;
        break;
      case KeyEvent.VK_LEFT:
      case KeyEvent.VK_A:
        movementInput.x = -1;
        break;
      case KeyEvent.VK_RIGHT:
      case KeyEvent.VK_D:
        movementInput.x = 1;
        break;
      case KeyEvent.VK_P:
        toggleLogic('p');
        break;
    }
    onKeyPress();
  }

  @Override
  public void keyReleased(KeyEvent e) {
    onKeyRelease();
  }

  private void onKeyPress() {
    //Main.onKeyPress(movementInput, pressedKey);
  }

  private void onKeyRelease() {
    movementInput = new Position();
  }

  private void toggleLogic(char actual) {
    char _default = 'ó';
    if (pressedKey != actual) {
      pressedKey = actual;
    } else {
      pressedKey = _default;
    }
  }
}
