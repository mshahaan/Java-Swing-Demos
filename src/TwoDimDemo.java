import java.awt.*;

import javax.swing.*;

public class TwoDimDemo extends JFrame{

    TwoDimPanel panel;

    TwoDimDemo(){

        panel = new TwoDimPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(panel);
        this.pack();
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
