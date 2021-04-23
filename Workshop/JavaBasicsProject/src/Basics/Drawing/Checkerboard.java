package Basics.Drawing;

import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void drawImage(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern

    //CHOOSE A DIVISOR OF WIDTH AND HEIGHT OR THE CODE BREAKS
    int size = 111;
    drawSquare(graphics, size);
  }

  public static void drawSquare(Graphics graphics, int size) {

    int[] xCoordinates = new int[(int) WIDTH / size];
    int[] yCoordinates = new int[(int) HEIGHT / size];

    //fill with x coordinates
    for (int i = 0; i < xCoordinates.length; i++) {
      xCoordinates[i] = WIDTH - size * (xCoordinates.length - i);
    }
    //fill with y coordinates
    for (int i = 0; i < yCoordinates.length; i++) {
      yCoordinates[i] = HEIGHT - size * (yCoordinates.length - i);
    }
    //drawing the stuff
    for (int i = 0; i < yCoordinates.length; i++) {
      for (int j = 0; j < xCoordinates.length; j++) {

        if (i % 2 == 0) {
          if (j % 2 == 0) {
            graphics.setColor(Color.black);
          } else {
            graphics.setColor(Color.white);
          }
        } else {
          if (j % 2 == 0) {
            graphics.setColor(Color.white);
          } else {
            graphics.setColor(Color.black);
          }
        }
        graphics.fillRect(xCoordinates[j], yCoordinates[i], size, size);
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