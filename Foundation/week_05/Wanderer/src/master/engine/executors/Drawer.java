package master.engine.executors;

import java.awt.Graphics;
import master.engine.tools.Converter;
import master.engine.variables.Position;
import master.gameobjects.GameObject;

public class Drawer {

  public void drawImage(Graphics graphics) {
    drawObject(graphics, Launcher.hero, 200);

  }


  public void drawObject(Graphics graphics, GameObject gameObject, int size) {

    Position posInInPx = Converter.positionConverter(gameObject.getPosition(), size);

    graphics.drawImage(
        gameObject.getIcon(),
        (int) posInInPx.x, (int) posInInPx.y,
        size, size,
        Launcher.screen
    );

  }

}