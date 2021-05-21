package master.gameobjects.character.characters;

import java.awt.Image;
import javax.swing.ImageIcon;
import master.engine.variables.Position;
import master.gameobjects.character.Character;
import master.gameobjects.character.Facing;

public class Hero extends Character {

  private Facing facing;
  String fileName;
  Image idleUp;
  Image idleDown;
  Image idleLeft;
  Image idleRight;

  public Hero(Position position){
    super(position, "hero",100,10, "hero/hero-down.png");
    facing = Facing.DOWN;
    idleUp = new ImageIcon("src/master/assets/img/characters/warrior anim/up/warrior idle back.gif").getImage();
    idleDown = new ImageIcon("src/master/assets/img/characters/warrior anim/down/warrior idle front.gif").getImage();
    idleLeft = new ImageIcon("src/master/assets/img/characters/warrior anim/left/warrior idle left.gif").getImage();
    idleRight = new ImageIcon("src/master/assets/img/characters/warrior anim/right/warrior idle right.gif").getImage();
    setIcon(idleDown);
  }


  @Override
  public void loadFacing() {
    switch (facing){
      case UP:
        break;
      case DOWN:
        fileName = "hero/hero-down.png";
        break;
      case LEFT:
        fileName = "hero/hero-left.png";
        break;
      case RIGHT:
        fileName = "hero/hero-right.png";
        break;
    }
  }

  @Override
  public void loadStatus() {

  }
}
