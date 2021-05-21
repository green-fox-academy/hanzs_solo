package week_02.Drawing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void drawImage(Graphics graphics) {
    // Create a function that takes 2 parameters:
    // an array of {x, y} points and graphics
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    int[][] array1 = new int[][] {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
    int[][] array2 = new int[][] {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        {120, 100}, {85, 130}, {50, 100}};

    drawPolygonForMe(graphics,array2);


  }

  public static void drawPolygonForMe(Graphics graphics, int[][] coordinates) {
    System.out.println(coordinates.length);

    //saving data to lists because cant initialize array without length
    List<Integer> xList = new ArrayList<>();
    List<Integer> yList = new ArrayList<>();
    for (int i = 0; i < coordinates.length; i++) {
      xList.add(coordinates[i][0]);
      yList.add(coordinates[i][1]);
    }
    //saving data to arrays because drawPolygon can't take Integer
    int [] x = new  int[xList.size()];
    int [] y = new  int[yList.size()];
    for (int i = 0; i < coordinates.length; i++) {
      x[i] = xList.get(i);
      y[i] = yList.get(i);
    }
    //drawing shit
    graphics.drawPolygon(x, y, coordinates.length);


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