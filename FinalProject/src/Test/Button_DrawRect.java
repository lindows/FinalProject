package Test;

import javax.swing.*;
import java.awt.*;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1411**
 */
public class Button_DrawRect extends JButton {
  public void paint(Graphics g) {
    super.paint(g);
    this.setSize(32,32);
    this.setLocation((32*7) + 10, 0);
    g.drawRect(5, 5, this.getWidth() - 10, this.getHeight() - 10);
    this.setText(" ");
  }
}
