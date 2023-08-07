package lab_reports.labone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageDisplayApp extends JFrame implements ActionListener {
    private final JLabel imageLabel;

    public ImageDisplayApp() {
        setTitle("Image Display");
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create panel to hold the image
        JPanel imagePanel = new JPanel();

        // Load initial image
        String path = "C:\\Users\\shasa\\Downloads\\AberdeenCollege.jpg";
        ImageIcon imageIcon = new ImageIcon(path, "AberdeenCollege");
        Image image = imageIcon.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);

        // Create label to display the image
        imageLabel = new JLabel(imageIcon);

        // Add label to the panel
        imagePanel.add(imageLabel);

        // Create button to change the image
        Button changeButton = new Button("Change Image");
        changeButton.addActionListener(this);

        // Add the components to the frame
        add(imagePanel, BorderLayout.CENTER);
        add(changeButton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        if (e.getActionCommand().equals("Change Image")) {
            // Load new image

            String path = "C:\\Users\\shasa\\Downloads\\VedasCollege.jpg";
            ImageIcon newImageIcon = new ImageIcon(path,"VedasCollege");
            Image newImage = newImageIcon.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
            newImageIcon = new ImageIcon(newImage);

            // Update the image label
            imageLabel.setIcon(newImageIcon);
        }
    }
    public static void main(String[] args) {
        ImageDisplayApp frame = new ImageDisplayApp();
        frame.setVisible(true);
    }
}
