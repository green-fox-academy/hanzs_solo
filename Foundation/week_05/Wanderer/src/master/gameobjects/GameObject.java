package master.gameobjects;

import java.awt.Image;
import javax.swing.ImageIcon;
import master.engine.variables.Position;

public abstract class GameObject {
  private Position position;
  private Image icon;

  public GameObject(Position position,String subPath) {
    this.position = position;
    icon = readImage(subPath);
  }

  public Image readImage(String subPath) {
    return new ImageIcon("src/assets/img/"+subPath).getImage();
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public Image getIcon() {
    return icon;
  }

  public void setIcon(Image icon) {
    this.icon = icon;
  }
}
