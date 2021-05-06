package master.engine.executors;

import java.awt.Graphics;
import master.engine.variables.Position;
import master.engine.tools.Converter;
import master.gameobjects.GameObject;
import master.gameobjects.character.characters.Hero;

public class Drawer {

  public void drawImage(Graphics graphics) {
    Hero hero = new Hero(new Position(1,1));
    drawObject(graphics,hero,200);

  }


  public void drawObject(Graphics graphics, GameObject gameObject, int size) {

    Position posInInPx = Converter.positionConverter(gameObject.getPosition(),size);

    graphics.drawImage(
        gameObject.getIcon(),
        posInInPx.x, posInInPx.y,
       size, size,
        Launcher.screen
    );

  }

}