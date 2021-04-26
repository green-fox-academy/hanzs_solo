package Basics.week_03.Recursion.Fibonacci;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawFibonacci3 {
  static int multiplier = 1;

  public static void drawImage(Graphics graphics) {
    int n = 15;
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
      int rgb3 = 255 / (getNthFibonacci(n-i) + 1);
      System.out.println(rgb1);
      //System.out.println(rgb2);
      //if (rgb>255)rgb = 255;
      graphics.setColor(new Color(rgb2, rgb2, rgb2));
      //
      direction++;
      if (direction == 9) {
        direction = 5;
      }
      int x1 =x;
      int y1 = y;
      int x2 = x;
      int y2 = y;
      switch (direction) {
        //unique
        case 1:
          break;
        case 2:
          x1 = x;
          y1 = y;
          x2 = x+a;
          y2 = y+a;
          graphics.fillRect(x, y, a, a);
          //graphics.setColor(new Color(rgb2,rgb1,100));
          //graphics.drawRect(x, y, a, a);
          graphics.setColor(new Color(rgb3, 20, 20));
          graphics.drawLine(x1,y1,x2,y2);
          break;
        case 3:
          x1 = x+a;
          y1 = y+a;
          x2 = x1+a;
          y2 = y1-a;
          x = x + a;
          graphics.fillRect(x, y, a, a);
          //graphics.setColor(new Color(rgb2,rgb1,100));
          //graphics.drawRect(x, y, a, a);
          graphics.setColor(new Color(rgb3, 20, 20));
          graphics.drawLine(x1,y1,x2,y2);
          break;
        case 4:
        x1 = x+b;
        y1 = y;
        x2 = x1-a;
        y2 = y1-a;
          x = x-b;
          y = y-a;
          graphics.fillRect(x, y, a, a);
          //graphics.setColor(new Color(rgb2,rgb1,100));
          //graphics.drawRect(x, y, a, a);
          graphics.setColor(new Color(rgb3, 20, 20));
        graphics.drawLine(x1,y1,x2,y2);
          break;
//        //pattern
        case 5:
          x1 = x;
          y1 = y;
          x2 = x1-a;
          y2 = y1+a;
          y = y ;
          x=x-a;
          graphics.fillRect(x, y, a, a);
          //graphics.setColor(new Color(rgb2,rgb1,100));
          //graphics.drawRect(x, y, a, a);
          graphics.setColor(new Color(rgb3, 20, 20));
        graphics.drawLine(x1,y1,x2,y2);
          break;
        case 6:
        x1 = x;
        y1 = y+b;
        x2 = x1+a;
        y2 = y1+a;
          x = x ;
          y = y +b;
          graphics.fillRect(x, y, a, a);
          //graphics.setColor(new Color(rgb2,rgb1,100));
          //graphics.drawRect(x, y, a, a);
          graphics.setColor(new Color(rgb3, 20, 20));
        graphics.drawLine(x1,y1,x2,y2);
          break;
        case 7:
        x1 = x+b;
        y1 = y+b;
        x2 = x1+a;
        y2 = y1-a;
          x = x +b;
          y = y -c;
          graphics.fillRect(x, y, a, a);
          //graphics.setColor(new Color(rgb2,rgb1,100));
          //graphics.drawRect(x, y, a, a);
          graphics.setColor(new Color(rgb3, 20, 20));
        graphics.drawLine(x1,y1,x2,y2);
          break;
        case 8:
        x1 = x+b;
        y1 = y;
        x2 = x1-a;
        y2 = y1-a;
          x = x-c;
          y = y-a;
          graphics.fillRect(x, y, a, a);
          //graphics.setColor(new Color(rgb2,rgb1,100));
          //graphics.drawRect(x, y, a, a);
          graphics.setColor(new Color(rgb3, 21, 20));
        graphics.drawLine(x1,y1,x2,y2);
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