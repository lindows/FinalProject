package v1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1355**
 */
public class Button_ClearScreen extends JButton {
  private BufferedImage clear;

  public Button_ClearScreen() {
    try {
      this.clear = ImageIO.read(new File("clear.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.drawImage(this.clear, 0, 0, getWidth() - 1, getHeight() - 1, 0, 0, 256, 256, null);
  }
}
