package v1;

import javax.swing.*;
import java.awt.*;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1415**
 */
public class Button_DrawOval extends JButton {
  public void paint(Graphics g) {
    super.paint(g);
    g.drawOval(5, 5, this.getWidth() - 5, this.getHeight() - 5);
  }
}
