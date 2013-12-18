package Test;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class OpenFile {
    
    public File openedFile = null;
    //public static final String DEFAULT_EXTENSION = "png";
    public String png = "png";
    public String[] extensions = {"png","jpg","img"};
    
    
    /**
     * Opens a file chooser and will then try access the file from memory
     */
    public void open(){
        JFileChooser fileChooser = new JFileChooser(".");  
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Types", extensions);
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG Files", png);
        fileChooser.setFileFilter(filter);
        
        if (fileChooser.showOpenDialog(null) == 0) {
            try {
                openedFile = fileChooser.getSelectedFile();
            } catch (Exception e1){
                System.out.println("File could not be loaded: " + e1);
            }
        }
    }
    
}
