package week_02.Drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
  public static void drawImage(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

    int size = 10;
    double scaling = 1.5;
    drawSteps3D(graphics, size, scaling);

  }

  private static void drawSteps3D(Graphics graphics, int size, double scaling) {
    size /= scaling;
    int position = 0;
    for (int i = 0; i < 6; i++) {
      size *= scaling;
      //draw outline
      graphics.setColor(Color.BLACK);
      graphics.drawRect(position, position, size, size);
      //fill
      graphics.setColor(new Color(180, 0, 180));
      graphics.fillRect(position, position, size, size);
      //set next coordinates
      position += size;
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