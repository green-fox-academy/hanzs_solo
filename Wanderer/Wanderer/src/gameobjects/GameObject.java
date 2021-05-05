package gameobjects;

import engine.variables.Position;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class GameObject {
  Position position;
  BufferedImage img;

  public GameObject(Position position,String subPath) {
    this.position = position;
    readImage(subPath);
  }

  public void readImage(String subPath) {
    try {
      img = ImageIO.read(new File("src/assets/img/"+subPath));
    } catch (IOException e) {
      System.err.println("img not found");
    }
  }
}
