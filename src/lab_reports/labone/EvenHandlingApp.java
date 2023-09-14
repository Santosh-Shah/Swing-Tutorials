package lab_reports.labone;

import java.awt.*;
import java.awt.event.*;

public class EvenHandlingApp {
    public static void main(String[] args) {
        // Create an instance of MyFrame (a subclass of Frame)
        MyFrame frame = new MyFrame("AWT UI Example");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);

        // Add a WindowListener to the frame to handle window events
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Handle the window closing event
                System.exit(0); // Exit the application
            }
        });
    }
}

// Create a custom subclass of Frame
class MyFrame extends Frame {
    public MyFrame(String title) {
        super(title); // Call the superclass constructor

        // Create a label
        Label label = new Label("Hello, AWT!");

        // Create a button
        Button closeButton = new Button("Close");

        // Set the layout manager for the frame
        setLayout(new FlowLayout());

        // Add the components to the frame
        add(label);
        add(closeButton);

        // Add an ActionListener to the close button to handle button click events
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the button click event
                System.exit(0); // Exit the application
            }
        });
    }
}
