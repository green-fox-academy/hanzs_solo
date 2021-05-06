package master.gameobjects.character;

import master.engine.variables.Position;
import master.gameobjects.GameObject;

public abstract class Character extends GameObject {
  private Position position;
  private Facing facing;
  private Status status;
  private String name;
  private int health;
  private int damage;


  public Character(Position position, String name, int health, int damage, String fileName ) {
    super(position, "characters/" +fileName);
    this.name = name;
    this.health = health;
    this.damage = damage;
  }



  public void setFacing(Facing facing) {
    this.facing = facing;
    loadFacing();
  }

  public abstract void loadFacing();

  public void setStatus(Status status) {
    this.status = status;
    loadStatus();
  }
  public abstract void loadStatus();
}
