package Test;

import java.awt.*;
import javax.swing.JButton;

/**
 * *v1** *FinalProject**  *ThomasR** *11142013:1651**
 */
public class Button_DrawFree extends JButton {

    public Button_DrawFree() {
        Dimension overrideSize = new Dimension(32, 32); 
        Insets overrideInsets = new Insets(18, 10, 0, 10);
               
        this.setText(" ");
        this.setToolTipText("Free Hand");
        this.setMaximumSize(overrideSize);
        this.setMinimumSize(overrideSize);
        this.setPreferredSize(overrideSize);
        this.setMargin(overrideInsets);
        this.setSize(overrideSize);

        try {
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/assets/freedraw.png")));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
