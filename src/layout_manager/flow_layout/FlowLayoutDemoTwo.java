package layout_manager.flow_layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemoTwo extends JFrame {
    // Creating default FlowLayout Constructor with alignment
    JButton b1, b2, b3, b4, b5;
    FlowLayoutDemoTwo() {
        b1 = new JButton("First");
        b2 = new JButton("Second");
        b3 = new JButton("Third");
        b4 = new JButton("Fourth");
        b5 = new JButton("Fifth");

        setLayout(new FlowLayout((int) FlowLayoutDemoTwo.TOP_ALIGNMENT));
        setTitle("FlowLayoutDemoOne");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutDemoTwo();
    }
}
