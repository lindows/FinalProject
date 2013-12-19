package Test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

class PrinterHandler implements Printable {

    Image toBEprinted;

    public PrinterHandler(Image toBEprinted) {
        this.toBEprinted = toBEprinted;
    }
    
    @Override
    public int print(
            Graphics graphics,
            PageFormat pageFormat,
            int pageIndex) throws PrinterException {
        
        Graphics2D flatImage = (Graphics2D) graphics;
        flatImage.drawImage(toBEprinted, 0, 0, null);
        return 0;
    }
}
