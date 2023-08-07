package google_helps;

import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {
        public RadioButtonDemo() {
            setTitle("Radio Buttons Example");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new FlowLayout()); // Create a panel with a grid layout

            JRadioButton option1 = new JRadioButton("Male"); // Create the first radio button
            JRadioButton option2 = new JRadioButton("Female"); // Create the second radio button
            JRadioButton option3 = new JRadioButton("Others"); // Create the second radio button

            ButtonGroup buttonGroup = new ButtonGroup(); // Create a button group to ensure only one option can be selected at a time
            buttonGroup.add(option1);
            buttonGroup.add(option2);
            buttonGroup.add(option3);

            panel.add(option1); // Add the radio buttons to the panel
            panel.add(option2);
            panel.add(option3);

            add(panel); // Add the panel to the JFrame

            pack(); // Pack the JFrame to ensure everything is displayed properly
            setLocationRelativeTo(null); // Center the JFrame on the screen
            setVisible(true); // Set the JFrame to be visible
        }
        public static void main(String[] args) {
            new RadioButtonDemo();
        }
}
