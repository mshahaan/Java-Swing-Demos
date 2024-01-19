import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton();

    JLabel label;

    MyFrame(){

        //custom instantiated JFrame 

        ImageIcon icon = new ImageIcon("thumbsup.png");
        ImageIcon icon2 = new ImageIcon("GlacierM.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button.setBounds(100, 100, 350,200);
        button.addActionListener(this);
        button.setText("Press Me");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); //makes button un-pressable
        
        this.setSize(500, 500); //sets x-dimension and y-dimension of frame
        this.setTitle("JFrame Title Text"); //sets title of frame;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //prevents user from closing frame
        this.setResizable(true); //prevent frame from being resized
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("GlacierM.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(Color.green); //change color of background
        this.getContentPane().setBackground(new Color(200, 200, 230)); //change color to custom color

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource() == button){
            System.out.println("Button Pressed");
            button.setEnabled(false); //makes button unpressable after one click
            label.setVisible(true);
        }
        
    }
    
}
