package Basics.Drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void drawImage(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]

    int size = 12;
    drawSteps(graphics, size);

  }

  private static void drawSteps(Graphics graphics, int size) {
    //outline
    graphics.setColor(new Color(70,0,70));
    for (int i = 0; i < 20; i++) {
      graphics.drawRect(i* size,i* size, size, size);
    }
    //fill
    graphics.setColor(new Color(214, 0, 214));
    for (int i = 0; i < 20; i++) {
      graphics.fillRect(i* size,i* size, size, size);
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