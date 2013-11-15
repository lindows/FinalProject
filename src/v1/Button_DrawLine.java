package v1;

import javax.swing.*;
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
    g.drawLine(5, 5, this.getWidth() - 10, this.getHeight() - 10);
  }
}
