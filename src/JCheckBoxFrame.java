import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxFrame extends JFrame implements ActionListener{

    JButton button;
    JCheckBox checkBox;
    ImageIcon selectedIcon;

    //JCheckBox: A GUI component that can be selected or deselected

    JCheckBoxFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        selectedIcon = new ImageIcon("thumbsup.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setSelectedIcon(selectedIcon);

        this.add(button);
        this.add(checkBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
        
    }

    
    
}
