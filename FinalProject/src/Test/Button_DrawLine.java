package Test;

import javax.swing.JButton;
import java.awt.*;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1649**
 */
public class Button_DrawLine extends JButton {
  public void paint(Graphics g) {
    super.paint(g);
    this.setSize(32,32);
    this.setLocation((32*5) + 10, 0);
    g.drawLine(5, 5, this.getWidth() - 10, this.getHeight() - 10);
    this.setText(" ");
  }
}
