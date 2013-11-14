package v1;

import javax.swing.*;
import java.awt.*;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1649**
 */
public class DrawLineBtn extends JButton {
  public void paint(Graphics g){
    super.paint(g);
    g.drawLine(5, 5, this.getWidth()-5, this.getHeight()-5);
  }
}
