import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JComboBoxFrame extends JFrame implements ActionListener{

        //JComboBox: A GUI component that combines a button or editable field
        //           and a drop-down list

    JComboBox comboBox;
    
    JComboBoxFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("bird");
        //comboBox.removeItemAt(1);
        //comboBox.removeAllItems();

        this.add(comboBox);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
        
    }
}
