package Basics.week_03.Demo;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawFibonacci {
  static int multiplier = 1;

  public static void drawImage(Graphics graphics) {
    int n = 15;
    int a;
    int b;
    int c;
    int x = WIDTH / 3;
    int y = HEIGHT / 3;
    int switchIndex = 0;

    for (int i = 1; i <= n; i++) {

      a = fibonacci(i);
      b = fibonacci(i - 1);
      c = fibonacci(i - 2);

      switchIndex++;
      //loop after unique
      if (switchIndex == 9) {
        switchIndex = 5;
      }

      //logic
      switch (switchIndex) {
      //unique
        case 1:
          break;
        case 2:
          graphics.drawRect(x, y, a, a);
          break;
        case 3:
          x = x + a;
          graphics.drawRect(x, y, a, a);
          break;
        case 4:
          x = x - b;
          y = y - a;
          graphics.drawRect(x, y, a, a);
          break;

      //pattern
        case 5:
          x = x - a;
          graphics.drawRect(x, y, a, a);
          break;
        case 6:
          y = y + b;
          graphics.drawRect(x, y, a, a);
          break;
        case 7:
          x = x + b;
          y = y - c;
          graphics.drawRect(x, y, a, a);
          break;
        case 8:
          x = x - c;
          y = y - a;
          graphics.drawRect(x, y, a, a);
          break;
      }
    }
  }


  private static int fibonacci(int n) {
    return getNthFibonacci(n - 1) * multiplier;
  }


  private static int getNthFibonacci(int n) {
    if (n <= 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return getNthFibonacci(n - 2) + getNthFibonacci(n - 1);
    }
  }

  // Don't touch the code below
  static int WIDTH = 900;
  static int HEIGHT = 600;

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