package lab_reports.labone;

import javax.swing.*;
import java.awt.*;

public class LayoutExample extends JFrame {

    private JPanel flowLayoutPanel;
    private JPanel borderLayoutPanel;
    private JPanel gridLayoutPanel;
    private JPanel cardLayoutPanel;

    public LayoutExample() {
        setTitle("Layout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        // Create the four JPanels
        flowLayoutPanel = new JPanel(new FlowLayout());
        borderLayoutPanel = new JPanel(new BorderLayout());
        gridLayoutPanel = new JPanel(new GridLayout(2, 2));
        cardLayoutPanel = new JPanel(new CardLayout());

        // Add components to the FlowLayout panel
        flowLayoutPanel.add(new JButton("Button 1"));
        flowLayoutPanel.add(new JButton("Button 2"));
        flowLayoutPanel.add(new JButton("Button 3"));
        flowLayoutPanel.add(new JButton("Button 4"));

        // Add components to the BorderLayout panel
        borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
        borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
        borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // Add components to the GridLayout panel
        gridLayoutPanel.add(new JButton("Button 1"));
        gridLayoutPanel.add(new JButton("Button 2"));
        gridLayoutPanel.add(new JButton("Button 3"));
        gridLayoutPanel.add(new JButton("Button 4"));

        // Add components to the CardLayout panel
        cardLayoutPanel.add(new JLabel("Card 1"), "Card 1");
        cardLayoutPanel.add(new JLabel("Card 2"), "Card 2");
        cardLayoutPanel.add(new JLabel("Card 3"), "Card 3");
        cardLayoutPanel.add(new JLabel("Card 4"), "Card 4");

        // Create the main container panel using BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Add the four panels to the main container panel
        mainPanel.add(flowLayoutPanel, BorderLayout.NORTH);
        mainPanel.add(borderLayoutPanel, BorderLayout.SOUTH);
        mainPanel.add(gridLayoutPanel, BorderLayout.WEST);
        mainPanel.add(cardLayoutPanel, BorderLayout.CENTER);

        // Add the main container panel to the JFrame
        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LayoutExample();
            }
        });
    }
}

