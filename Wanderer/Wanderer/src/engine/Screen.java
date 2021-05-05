package engine;

import engine.executors.Drawer;
import engine.executors.InputHandler;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Screen extends JComponent {
  //set reference
  public static Screen screen = new Screen();
  //get references
  Drawer drawer = Drawer.drawer;
  //fields
  public int size = 600;

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    drawer.drawImage(graphics);
  }

  public void setScreen() {
    //set frame
    JFrame frame = new JFrame("RPG Game");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    //add drawer
    screen.setPreferredSize(new Dimension(size, size));
    frame.add(screen);
    frame.pack();

    //add player input
    InputHandler inputHandler = new InputHandler();
    frame.addKeyListener(inputHandler);
  }

}
