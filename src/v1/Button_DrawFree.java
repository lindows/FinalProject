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
 * *11142013:1651**
 */
public class Button_DrawFree extends JButton {
  private BufferedImage IMG_freehand;

  public Button_DrawFree() {
    try {
      this.IMG_freehand = ImageIO.read(new File("/assets/freedraw.png"));
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.drawImage(this.IMG_freehand, 0, 0, this.getWidth(), this.getHeight(), 0, 0, 256, 256, null);
  }
}
