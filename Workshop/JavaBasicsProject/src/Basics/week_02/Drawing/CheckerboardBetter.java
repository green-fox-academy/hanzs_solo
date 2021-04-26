package Basics.week_02.Drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerboardBetter {
  public static void drawImage(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern
    int size = 2;
    drawPattern(graphics, size);
  }

  private static void drawPattern(Graphics graphics, int size) {
    int x = 0;
    int y = 0;



    for (int i = 0; i < HEIGHT / size; i++) {
      for (int j = 0; j < WIDTH / size; j++) {
        decideColor(graphics, i, j);
        graphics.fillRect(x, y, size, size);
        x += size;
      }
      x = 0;
      y += size;
    }
  }

  private static void decideColor(Graphics graphics, int i, int j) {
    if (i % 2 == 0) {
      if (j % 2 != 0) {
        graphics.setColor(Color.black);
      } else {
        graphics.setColor(Color.white);
      }
    } else {
      if (j % 2 != 0) {
        graphics.setColor(Color.white);
      } else {
        graphics.setColor(Color.black);
      }
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
    }
  }
}