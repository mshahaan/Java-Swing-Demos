import java.awt.*;

import javax.swing.*;

public class TwoDimPanel extends JPanel{

    TwoDimPanel(){

        this.setPreferredSize(new Dimension(500, 500));

    }

    @Override
    public void paint(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));

        g2d.drawLine(0, 0, 500, 500);

        g2d.setPaint(Color.RED);

        //g2d.drawRect(0, 0, 100, 200);
        g2d.fillRect(0, 0, 100, 200);

        g2d.setPaint(Color.ORANGE);

        //g2d.drawOval(0, 0, 100, 100);
        g2d.fillOval(0, 0, 100, 100);
    }
    
}
