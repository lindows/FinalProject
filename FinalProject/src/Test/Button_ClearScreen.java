package Test;

import java.awt.*;
import javax.swing.JButton;

/**
 * *v1** *FinalProject**  *ThomasR** *11142013:1355**
 */
public class Button_ClearScreen extends JButton {

    public Button_ClearScreen() {
        Dimension overrideSize = new Dimension(32, 32);
        Insets overrideInsets = new Insets(18, 10, 0, 10);

        this.setText(" ");
        this.setToolTipText("Clear Screen");
        this.setMaximumSize(overrideSize);
        this.setMinimumSize(overrideSize);
        this.setPreferredSize(overrideSize);
        this.setMargin(overrideInsets);
        this.setSize(overrideSize);
        try {
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/assets/clear.png")));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
