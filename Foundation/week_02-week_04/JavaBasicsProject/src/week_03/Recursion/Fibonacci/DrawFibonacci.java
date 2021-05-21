package week_03.Recursion.Fibonacci;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawFibonacci {
  static int multiplier = 8;

  public static void drawImage(Graphics graphics) {
    int n = 11;
    int a;
    int b;
    int c;
    int x = WIDTH / 3;
    int y = HEIGHT / 3;
    int direction = 0;

    for (int i = 1; i <= n; i++) {
      a = fibonacci(i);
      b = fibonacci(i - 1);
      c = fibonacci(i - 2);
      int rgb1 = 200 / (getNthFibonacci(i));
      int rgb2 = 200 / (getNthFibonacci(n - i) + 1);
      System.out.println(rgb1);
      //System.out.println(rgb2);
      //if (rgb>255)rgb = 255;
      graphics.setColor(new Color(rgb2, rgb2, rgb2));
      //
      direction++;
      if (direction == 9) {
        direction = 5;
      }
      switch (direction) {
        //unique
        case 1:
          break;
        case 2:
          graphics.fillRect(x, y, a, a);
          break;
        case 3:
          x = x + a;
          graphics.fillRect(x, y, a, a);
          break;
        case 4:
          x = x-b;
          y = y-a;
          graphics.fillRect(x, y, a, a);
          break;
//        //pattern
        case 5:
          x=x-a;
          graphics.fillRect(x, y, a, a);
          break;
        case 6:
          y = y +b;
          graphics.fillRect(x, y, a, a);
          break;
        case 7:
          x = x +b;
          y = y -c;
          graphics.fillRect(x, y, a, a);
          break;
        case 8:
          x = x-c;
          y = y-a;
          graphics.fillRect(x, y, a, a);
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