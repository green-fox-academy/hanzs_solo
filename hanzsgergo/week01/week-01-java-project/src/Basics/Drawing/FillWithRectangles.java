package Basics.Drawing;

import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

  public static void drawImage(Graphics graphics){
    // Draw four different size and color rectangles
    // Avoid code duplication!

    Random rand = new Random();

    for (int i = 0; i < 4; i++) {
      int size = rand.nextInt(100);
      int x = rand.nextInt(WIDTH-size);
      int y = rand.nextInt(HEIGHT-size);
      graphics.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));

      drawRectForMe(graphics,x,y,size);

    }

  }
  public static  void drawRectForMe(Graphics graphics, int x, int y, int size){
    graphics.fillRect(x,y,size,size);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);
    }
  }
}