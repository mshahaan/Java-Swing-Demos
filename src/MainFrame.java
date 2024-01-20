import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener{

    JLabel topText;

    JPanel choiceContainer;
    JPanel selectButtonContainer;

    JButton selectButton;

    JRadioButton fileChooser;
    JRadioButton checkBox;
    JRadioButton colorChooser;
    JRadioButton radioButton;
    JRadioButton comboBox;
    JRadioButton slider;
    JRadioButton textField;
    JRadioButton keyBindings;
    JRadioButton keyListener;
    JRadioButton mouseListener;
    JRadioButton progressbar;
    JRadioButton twoDimGraphics;
    JRadioButton twoDimAnimation;

    MainFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 600);

        topText = new JLabel();
        topText.setBounds(0, 0, 400, 100);
        topText.setText("Select a Java Swing Demo:");   
        topText.setVerticalAlignment(JLabel.TOP);
        topText.setFont(new Font("Arial", Font.BOLD, 25));
        
        choiceContainer = new JPanel();
        choiceContainer.setBounds(0, 100, 400, 400);
        choiceContainer.setBackground(Color.LIGHT_GRAY);

        choiceContainer.setLayout(new GridLayout(7, 2));

        fileChooser = new JRadioButton("File Chooser Demo");
        checkBox = new JRadioButton("Check Box Demo");
        colorChooser = new JRadioButton("Color Chooser Demo");
        radioButton = new JRadioButton("Radio Button Demo");
        comboBox = new JRadioButton("Combo Box");
        slider = new JRadioButton("Slider Demo");
        textField = new JRadioButton("TextField Demo");
        keyBindings = new JRadioButton("KeyBinding Demo");
        keyListener = new JRadioButton("KeyListener Demo");
        mouseListener = new JRadioButton("MouseListener Demo");
        progressbar = new JRadioButton("Progressbar Demo");
        twoDimGraphics = new JRadioButton("2D Graphics");
        twoDimAnimation = new JRadioButton("2D Animation");

        fileChooser.setBackground(Color.LIGHT_GRAY);
        checkBox.setBackground(Color.LIGHT_GRAY);
        colorChooser.setBackground(Color.LIGHT_GRAY);
        radioButton.setBackground(Color.LIGHT_GRAY);
        comboBox.setBackground(Color.LIGHT_GRAY);
        slider.setBackground(Color.LIGHT_GRAY);
        textField.setBackground(Color.LIGHT_GRAY);
        keyBindings.setBackground(Color.LIGHT_GRAY);
        keyListener.setBackground(Color.LIGHT_GRAY);
        mouseListener.setBackground(Color.LIGHT_GRAY);
        progressbar.setBackground(Color.LIGHT_GRAY);
        twoDimGraphics.setBackground(Color.LIGHT_GRAY);
        twoDimAnimation.setBackground(Color.LIGHT_GRAY);

        ButtonGroup choiceGroup = new ButtonGroup();

        choiceGroup.add(fileChooser);
        choiceGroup.add(checkBox);
        choiceGroup.add(colorChooser);
        choiceGroup.add(radioButton);
        choiceGroup.add(comboBox);
        choiceGroup.add(slider);
        choiceGroup.add(textField);
        choiceGroup.add(keyBindings);
        choiceGroup.add(keyListener);
        choiceGroup.add(mouseListener);
        choiceGroup.add(progressbar);
        choiceGroup.add(twoDimGraphics);
        choiceGroup.add(twoDimAnimation);

        choiceContainer.add(fileChooser);
        choiceContainer.add(checkBox);
        choiceContainer.add(colorChooser);
        choiceContainer.add(radioButton);
        choiceContainer.add(comboBox);
        choiceContainer.add(slider);
        choiceContainer.add(textField);
        choiceContainer.add(keyBindings);
        choiceContainer.add(keyListener);
        choiceContainer.add(mouseListener);
        choiceContainer.add(progressbar);
        choiceContainer.add(twoDimGraphics);
        choiceContainer.add(twoDimAnimation);

        selectButtonContainer = new JPanel();
        selectButtonContainer.setBounds(400, 100, 100, 400);
        selectButtonContainer.setBackground(Color.LIGHT_GRAY);
        selectButtonContainer.setLayout(new GridBagLayout());

        selectButton = new JButton("Select");
        selectButton.addActionListener(this);
        
        selectButtonContainer.add(selectButton, new GridBagConstraints());

        this.add(topText);
        this.add(choiceContainer);
        this.add(selectButtonContainer);

        //this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == selectButton){

            if(fileChooser.isSelected()) new FileChooserDemo();
            if(checkBox.isSelected()) new JCheckBoxFrame();
            if(colorChooser.isSelected()) new JColorChooserDemo();
            if(radioButton.isSelected()) new JRadioButtonFrame();
            if(comboBox.isSelected()) new JComboBoxFrame();
            if(slider.isSelected()) new SliderDemo();
            if(textField.isSelected()) new NewFrame();
            if(keyBindings.isSelected()) new KeyBindingDemo();
            if(keyListener.isSelected()) new KeyListenerDemo();
            //if(mouseListener.isSelected()) new MouseListenerDemo();
            if(progressbar.isSelected()) new ProgressBarDemo();
            if(twoDimGraphics.isSelected()) new TwoDimDemo();
            if(twoDimAnimation.isSelected()) new TwoDimAnimationDemo();

        }
        
    }
    
}
