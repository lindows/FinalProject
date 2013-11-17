package v1;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1823**
 */
public class fileEXT extends FileFilter {
  @Override
  public boolean accept(File chosenFile) {
    if((chosenFile.getName().indexOf("png") > 0)||(chosenFile.getName().indexOf("img") > 0)){
      return true;
    }
    return false;
  }

  @Override
  public String getDescription() {
    return null;
    // return ".png";
    // return ".img";
  }
}
