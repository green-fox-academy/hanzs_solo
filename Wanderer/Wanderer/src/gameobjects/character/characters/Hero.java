package gameobjects.character.characters;

import engine.variables.Position;
import gameobjects.character.Character;
import gameobjects.character.Facing;

public class Hero extends Character {

  private Facing facing;
  String fileName;

  public Hero(Position position){
    super(position, "hero",100,10, "hero/hero-down.png");
    facing = Facing.DOWN;
  }


  @Override
  public void loadFacing() {
    switch (facing){
      case UP:
        fileName = "hero/hero-up.png";
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
