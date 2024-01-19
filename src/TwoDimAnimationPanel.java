import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TwoDimAnimationPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 1300;
    final int PANEL_HEIGHT = 700;

    Image logo;

    Timer timer;

    int xVelocity = 2;
    int yVelocity = 1;
    int xPosition = 0;
    int yPosition = 0;

    TwoDimAnimationPanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        logo = new ImageIcon("dvdLogo.png").getImage();

        //Since the Timer is set to the ActionListener, each tick of the Timer (100 millis)
        //will call the ActionListener Method where the source is the Timer
        timer = new Timer(10, this); 
        timer.start(); //Timer will start so ActionListener is called every delay millis

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (xPosition >= PANEL_WIDTH - logo.getWidth(null) || xPosition < 0) {

            xVelocity *= -1;
            
        }

        if (yPosition >= PANEL_HEIGHT - logo.getHeight(null) || yPosition < 0) {

            yVelocity *= -1;
            
        }
        
        xPosition += xVelocity;
        yPosition += yVelocity;
        
        repaint();
        
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g); //paint background
        
        Graphics2D G = (Graphics2D) g;

        G.drawImage(logo, xPosition, yPosition, null);

    }
    
}
