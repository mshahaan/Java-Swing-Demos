import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class FileChooserDemo extends JFrame implements ActionListener{

    //JFileChooser: A GUI mechanism that lets a user choose a file

    JButton button;

    FileChooserDemo(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select a File");
        button.addActionListener(this);

        this.add(button);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();
            
            int response = fileChooser.showOpenDialog(null);
            //int response = fileChooser.showSaveDialog(null);
            
            if (response == JFileChooser.APPROVE_OPTION) {

                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                
            }
        }
        
    }
    
}
