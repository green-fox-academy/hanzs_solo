package master.engine;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import master.engine.executors.Drawer;
import master.engine.executors.InputHandler;
import master.engine.tools.Values;

public class Screen extends JComponent {
  //fields
  Drawer drawer;

  public Screen(Drawer drawer){
    this.drawer = drawer;
  }

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
    setPreferredSize(new Dimension(Values.SCREEN_SIZE.value, Values.SCREEN_SIZE.value));
    frame.add(this);
    frame.pack();

    //add player input
    InputHandler inputHandler = new InputHandler();
    frame.addKeyListener(inputHandler);
  }

}
