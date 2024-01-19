import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class KeyListenerDemo extends JFrame implements KeyListener {

        //Key Binding: Binding an action to a keyStroke
        //             Doesn't require you to click a component to give it a focus
        //             all Swing components use Key Bindings
        //             increased flexibility compared to KeyListeners
        //             can assign key strokes to individual Swing components
        //             more difficult to utilize and set up 

    JLabel label;
    ImageIcon icon;

    KeyListenerDemo(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("goku.png");

        label = new JLabel();
        label.setBounds(0, 0, 241, 223);
        //label.setBackground(Color.RED);
        //label.setOpaque(true);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.BLACK);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //invoked when a key is typed, uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX()+10, label.getY());
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 39:
                label.setLocation(label.getX()+10, label.getY());
                break;
            default:
                break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //called whenever a key is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released Key code: " + e.getKeyCode());
    }
    
}
