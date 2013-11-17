package V1;

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
 * *11142013:1358**
 */
public class Button_SavePicture extends JButton {
  private BufferedImage save;

  public Button_SavePicture() {
    try {
      this.save = ImageIO.read(new File("/assets/save.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.drawImage(this.save, 0, 0, this.getWidth() - 1, this.getHeight() - 1, 0, 0, 256, 256, null);
  }
}
