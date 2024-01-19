import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JColorChooserDemo extends JFrame implements ActionListener{

    //JColorChooser: A GUI mechanism that lets a user choose a color

    JButton button;
    JLabel label;

    int backOrForeGround = 1;

    JColorChooserDemo(){        
        
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Pick a Color");
    button.addActionListener(this);

    label = new JLabel();
    label.setBackground(Color.WHITE);
    label.setText("Sample Text");
    label.setFont(new Font("Times New Roman", Font.PLAIN, 100));
    label.setOpaque(true);

    this.add(button);
    this.add(label);

    this.pack();
    this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource() == button && backOrForeGround == 1) {

            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.BLACK);

            label.setForeground(color);

            backOrForeGround = 0;
            
        }
        else if (e.getSource() == button && backOrForeGround == 0) {

            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.BLACK);

            label.setBackground(color);

            backOrForeGround = 1;
            
        }
        
    }
    
}
