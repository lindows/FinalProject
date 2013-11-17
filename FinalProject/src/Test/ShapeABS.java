package Test;

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
      ", paramBoolean=" + shapeStroke +
      ", shapeAlpha=" + shapeAlpha +
      '}';
  }

  Graphics drawnGraphics;
  Color shapeColor;
  BasicStroke shapeStroke;
  GradientPaint shapeGradient;
  TexturePaint shapeTexture;
  int PosX = 0, PosY = 0, lengthX = 0, lengthY = 0;
  boolean prambool;
  float shapeAlpha;


  public abstract void drawShape(
          Graphics drawnGraphics,
          int PosX, 
          int PosY, 
          int lengthX,
          int lengthY, 
          Color shapeColor, 
          BasicStroke shapeStrokeSize, 
          boolean prambool, 
          float shapeAlpha, 
          GradientPaint shapeGradient, 
          TexturePaint shapeTexture);

}