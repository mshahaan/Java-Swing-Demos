import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class KeyBindingDemo {

    JFrame frame;
    JLabel label;

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Action changeToRed;
    Action changeToBlue;
    Action changeToGreen;
    
    KeyBindingDemo(){

        frame = new JFrame("KeynBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new downAction();
        leftAction = new leftAction();
        rightAction = new rightAction();

        changeToRed = new changeToRed();
        changeToBlue = new changeToBlue();
        changeToGreen = new changeToGreen();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upActionAlt");
        label.getActionMap().put("upActionAlt", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downActionAlt");
        label.getActionMap().put("downActionAlt", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftActionAlt");
        label.getActionMap().put("leftActionAlt", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightActionAlt");
        label.getActionMap().put("rightActionAlt", rightAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('r'), "changeToRed");
        label.getActionMap().put("changeToRed", changeToRed);
        label.getInputMap().put(KeyStroke.getKeyStroke('b'), "changeToBlue");
        label.getActionMap().put("changeToBlue", changeToBlue);
        label.getInputMap().put(KeyStroke.getKeyStroke('g'), "changeToGreen");
        label.getActionMap().put("changeToGreen", changeToGreen);

        frame.add(label);

        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            label.setLocation(label.getX(), label.getY() - 10);
            
        }

    }

    public class leftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            label.setLocation(label.getX() - 10, label.getY());
            
        }

    }

    public class downAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            label.setLocation(label.getX(), label.getY() + 10);
            
        }

    }

    public class rightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            label.setLocation(label.getX() + 10, label.getY());
            
        }

    }

    public class changeToRed extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            label.setBackground(Color.RED);
            
        }

    }

    public class changeToGreen extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            label.setBackground(Color.green);
            
        }

    }

    public class changeToBlue extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            label.setBackground(Color.BLUE);
            
        }

    }
}
