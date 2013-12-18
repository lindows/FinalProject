package Test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SaveFile {
    public File savedFile = null;
    //public static final String DEFAULT_EXTENSION = "png";
    public String png = "png";
    public String[] saveableNames = ImageIO.getWriterFormatNames();
    
    public void save(Image tobe_Saved){
    JFileChooser fileChooser = new JFileChooser("."); 
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Types", saveableNames);
    fileChooser.setFileFilter(filter);

    if (fileChooser.showSaveDialog (null) == 0) {
       try {
            savedFile = fileChooser.getSelectedFile();
            ImageIO.write((BufferedImage)tobe_Saved, "jpg", savedFile);
        } catch (Exception e1) {
            System.out.println("Error saving file");
            e1.printStackTrace();
        }
    }
}

}
