package lab_reports.labone;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class AgeStatusSlider extends JFrame {

    private JSlider ageSlider;
    private JLabel ageStatusLabel;

    public AgeStatusSlider() {
        setTitle("Age Status Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        // Create the main container panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create the slider panel
        JPanel sliderPanel = new JPanel(new FlowLayout());
        mainPanel.add(sliderPanel, BorderLayout.CENTER);

        // Create the age status label
        ageStatusLabel = new JLabel("Status: ");
        mainPanel.add(ageStatusLabel, BorderLayout.SOUTH);

        // Create the slider
        ageSlider = new JSlider(0, 90);
        ageSlider.setMajorTickSpacing(10);
        ageSlider.setMinorTickSpacing(1);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);

        // Add change listener to the slider
        ageSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int value = ageSlider.getValue();
                updateAgeStatus(value);
            }
        });

        // Add the slider to the panel
        sliderPanel.add(ageSlider);

        // Add the main container panel to the JFrame
        add(mainPanel);

        setVisible(true);
    }

    private void updateAgeStatus(int age) {
        String status;
        if (age >= 0 && age <= 5) {
            status = "Infant";
        } else if (age > 5 && age <= 13) {
            status = "Child";
        } else if (age > 13 && age <= 19) {
            status = "Teen";
        } else if (age > 19 && age <= 30) {
            status = "Youth";
        } else if (age > 30 && age <= 50) {
            status = "Adult";
        } else {
            status = "Old";
        }

        ageStatusLabel.setText("Status: " + status);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AgeStatusSlider();
            }
        });
    }
}

