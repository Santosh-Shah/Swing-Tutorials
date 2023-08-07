package lab_reports.labone;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class EvenHandlingApp extends JFrame {
    public EvenHandlingApp() {
        setTitle("Event Handling");
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Add window listener to handle closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame
                System.exit(0); // Terminate the application
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        // Make a user interface using AWT components and write an event handling procedure to close
        // the Frame when close button of Frame is clicked.

        new EvenHandlingApp();

    }
}
