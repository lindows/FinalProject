package v1;

import java.awt.*;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1403**
 */
public abstract class ShapeABS {
  int PosX = 0, PosY = 0, lengthX = 0, lengthY = 0;

  public abstract void drawShape(Graphics drawnGraphics, int PosX, int PosY, int lengthX, int lengthY, Color shapeColor, BasicStroke shapeStrokeSize, boolean paramBoolean, float paramFloat, GradientPaint shapeGradient, TexturePaint shapeTexture);
}
