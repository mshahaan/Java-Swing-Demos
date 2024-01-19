import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameTut {
    
    public static void main(String[] args) {
        
        // JFrame: a GUI windwo to add components to

        JFrame frame = new JFrame(); //creates a frame

        frame.setSize(420, 420); //sets x-dimension and y-dimension of frame
        frame.setTitle("JFrame Title Text"); //sets title of frame;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //prevents user from closing frame
        frame.setResizable(false); //prevent frame from being resized
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("GlacierM.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(Color.green); //change color of background
        frame.getContentPane().setBackground(new Color(200, 200, 230)); //change color to custom color

    }
}
