package Basics.Drawing;

import java.util.Random;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
  public static void drawImage(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters
    // (the square size, the fill color and the graphics)
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).


    //eltértem a feladattól, nem kér colort a function

    //CHOOSE A DIVISOR OF WIDTH AND HEIGHT OR THE CODE BREAKS
    int size = 1;
    drawSquare(graphics, size);
  }

  public static void drawSquare(Graphics graphics, int size) {
    Random rand = new Random();
    Color[] colors =
        {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, new Color(0x4B0082),
            new Color(0x8F00FF)};
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
        Color currentColor = colors[rand.nextInt(7)];
        graphics.setColor(currentColor);
        graphics.fillRect(xCoordinates[j],yCoordinates[i],size,size);
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