package v1;

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
    g.drawRect(5, 5, this.getWidth() - 10, this.getHeight() - 10);
  }
}
