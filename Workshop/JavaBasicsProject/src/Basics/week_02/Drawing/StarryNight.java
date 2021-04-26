package Basics.week_02.Drawing;

import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void drawImage(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)
    starDrawer(graphics);
  }


  public static void starDrawer(Graphics graphics) {


    Random random = new Random();
    int x = 0;
    int y = 0;
    int greyShades = 0;
    int size = 0;


    for (int i = 0; i < 200; i++) {
      size = random.nextInt(6);
      x = random.nextInt(321-size);
      y = random.nextInt(321-size);
      greyShades = 100 + random.nextInt(156);

      graphics.setColor(new Color(greyShades,greyShades,greyShades));
      graphics.fillRect(x,y,size,size);
    }
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
      this.setBackground(new Color(10,10,10));
    }
  }
}