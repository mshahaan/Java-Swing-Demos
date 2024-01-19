import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Image;

public class TwoDimAnimationDemo extends JFrame{

    TwoDimAnimationPanel panel;

    Image logo;

    TwoDimAnimationDemo(){

        panel = new TwoDimAnimationPanel();

        logo = new ImageIcon("dvdLogo.png").getImage();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(logo);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
