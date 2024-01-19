import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class JLabelTut {
    
    public static void main(String[] args) {
        
        //Jlabel: a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("GlacierM.png");
        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);

        JLabel label = new JLabel(); //create a label
        label.setText("Label Text"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, or RIGHT of imageicon
        //label.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP, CENTER, or BOTTOM of imageicon
        label.setForeground(Color.green); //set font color of text
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20)); //set font of text
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.BLACK); //set Background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon and text
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text
        //label.setBounds(100, 0, 600, 600); //set x,y position within frame as well as dimensions

        MyFrame frame = new MyFrame();
        //frame.setLayout(null); //gets rid of default layout manager
        frame.add(label);
        frame.pack(); //adjusts frame size to size of label(s) [Do this after adding all components]
    }
}
