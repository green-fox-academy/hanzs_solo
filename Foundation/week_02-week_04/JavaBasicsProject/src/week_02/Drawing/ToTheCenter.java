package week_02.Drawing;

import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
  public static void drawImage(Graphics graphics) {
    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    int x = 0;
    int y = 0;
    // The function shall draw a line from that point to the center of the canvas
    // Draw at least 3 lines with that function using a loop

    Random random = new Random();

    for (int i = 0; i < 10000; i++) {
      x = random.nextInt(321);
      y = random.nextInt(321);
      graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
      lineDrawer(graphics, x , y);
    }
  }

  public static void lineDrawer(Graphics graphics, int x, int y) {
    graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
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
      //this.setBackground(new Color(20,20,20));
    }
  }
}