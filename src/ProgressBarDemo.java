import java.awt.*;

import javax.swing.*;

public class ProgressBarDemo {

    //Progress Bar: Visual aid to let the user know that an operation is processing

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);

    ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);

        bar.setFont(new Font("Times New Roman", Font.BOLD, 25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

    }

    public void fill(){
        int counter = 0;

        while (counter <= 100) {

            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter++;
            
        }

        bar.setString("Done!");
    }
    
}
