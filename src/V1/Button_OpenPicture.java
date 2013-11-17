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
 * *11142013:1707**
 */
public class Button_OpenPicture extends JButton {
  private BufferedImage openedData;

  public Button_OpenPicture() {
    try {
      this.openedData = ImageIO.read(new File("/assets/open.png"));
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }

  public void print(Graphics g) {
    super.paint(g);
    g.drawImage(this.openedData, 0, 0, getWidth(), getHeight(), 0, 0, 256, 256, null);
  }
}
