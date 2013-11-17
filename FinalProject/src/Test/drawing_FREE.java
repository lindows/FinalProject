package Test;

import java.awt.*;

/**
 * Project: FinalProject
 * Package: v1
 * Date: 11/15/1310:45 AM
 */
public class drawing_FREE extends ShapeABS {
  @Override
  public void drawShape(Graphics drawnGraphics, int PosX, int PosY, int lengthX, int lengthY, Color shapeColor, BasicStroke shapeStrokeSize, boolean shapeFilled, float shapeAlpha, GradientPaint shapeGradient, TexturePaint shapeTexture) {
      Graphics2D flatImage = (Graphics2D)drawnGraphics;
     flatImage.setColor(shapeColor);
     flatImage.setStroke(shapeStrokeSize);
     //AlphaComposite ac = AlphaComposite.getInstance(3, shapeAlpha);
     //flatImage.setComposite(ac);
     if (shapeGradient != null) {
       flatImage.setPaint(shapeGradient);
     }
     flatImage.drawOval(PosX, PosY, 4, 4);

  }
}
