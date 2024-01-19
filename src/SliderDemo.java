import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {

    //JSlider: A GUI component that lets the user enter a value 
    //         by using an adjustable slider

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);

        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);

        label.setText(slider.getValue() + " degrees Celsius");

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        label.setText(slider.getValue() + " degrees Celsius");
        
    }
    
}
