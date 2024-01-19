import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTut {
    
    public static void main(String[] args) {
        
        //JPanel : a GUI component that functions as a container for other GUI components

        ImageIcon icon = new ImageIcon("thumbsup.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        JLabel label2 = new JLabel();
        label2.setText("Hello");
        label2.setIcon(icon);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setForeground(Color.green);
        label2.setBounds(30, 30, 150, 150);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());

        MyFrame frame = new MyFrame();
        frame.setSize(750, 750);
        frame.setLayout(null);
        greenPanel.add(label);
        bluePanel.add(label2);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.pack();

    }
}
