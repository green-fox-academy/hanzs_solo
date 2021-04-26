package Basics.week_02.Drawing;

import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
  public static void drawImage(Graphics graphics) {
    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a 50 long horizontal line from that point
    // Draw at least 3 lines with that function using a loop


    int x = 0;
    int y = 0;

    Random random = new Random();

    for (int i = 0; i < 20; i++) {
      x = random.nextInt(321);
      y = random.nextInt(321);
      graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
      lineDrawer(graphics, x, y);
    }


  }

  public static void lineDrawer(Graphics graphics, int x, int y) {
    graphics.drawLine(x, y, x + 50, y);
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