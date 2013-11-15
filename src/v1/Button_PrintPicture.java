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
 * *11142013:1712**
 */
public class Button_PrintPicture extends JButton {
  private BufferedImage printDrawnImage;

  public Button_PrintPicture() {
    try {
      this.printDrawnImage = ImageIO.read(new File("print.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.drawImage(this.printDrawnImage, 0, 0, this.getWidth(), this.getHeight(), 0, 0, 256, 256, null);
  }
}
