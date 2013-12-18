package V1;

import java.awt.*;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1403**
 */
public abstract class ShapeABS {
  @Override
  public String toString() {
    return "ShapeABS{" +
      "drawnGraphics=" + drawnGraphics +
      ", shapeColor=" + shapeColor +
      ", shapeStroke=" + shapeStroke +
      ", shapeGradient=" + shapeGradient +
      ", shapeTexture=" + shapeTexture +
      ", PosX=" + PosX +
      ", PosY=" + PosY +
      ", lengthX=" + lengthX +
      ", lengthY=" + lengthY +
      ", paramBoolean=" + paramBoolean +
      ", paramFloat=" + paramFloat +
      '}';
  }

  Graphics drawnGraphics;
  Color shapeColor;
  BasicStroke shapeStroke;
  GradientPaint shapeGradient;
  TexturePaint shapeTexture;
  int PosX = 0, PosY = 0, lengthX = 0, lengthY = 0;
  boolean paramBoolean;
  float paramFloat;


  public abstract void drawShape(Graphics drawnGraphics, int PosX, int PosY, int lengthX, int lengthY, Color shapeColor, BasicStroke shapeStrokeSize, boolean paramBoolean, float paramFloat, GradientPaint shapeGradient, TexturePaint shapeTexture);
}
