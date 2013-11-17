package Test;

import javax.swing.*;
import java.awt.*;

/**
 * *v1** *FinalProject**  *ThomasR** *11142013:1358**
 */
public class Button_SavePicture extends JButton {

    public Button_SavePicture() {
        Dimension overrideSize = new Dimension(32, 32);
        Insets overrideInsets = new Insets(18, 10, 0, 10);

        this.setText(" ");
        this.setToolTipText("Save Picture");
        this.setMaximumSize(overrideSize);
        this.setMinimumSize(overrideSize);
        this.setPreferredSize(overrideSize);
        this.setMargin(overrideInsets);
        this.setSize(overrideSize);

        try {
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/assets/save.png")));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
