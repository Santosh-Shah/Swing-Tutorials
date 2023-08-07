package layout_manager.box_layout;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemoOne extends JFrame {
    // Creating BoxLayout in Y-axis
//    JButton jButton[];
    JButton b1, b2, b3, b4, b5;
    BoxLayoutDemoOne() {
        // using arrays of JButton class
//        jButton = new JButton[5];
//        for (int i = 0; i < jButton.length; i++) {
//            jButton[i] = new JButton("Button" + (i + 1));
//            add(jButton[i]);
//        }

        b1 = new JButton("First");
        b2 = new JButton("Second");
        b3 = new JButton("Third");
        b4 = new JButton("Fourth");
        b5 = new JButton("Fifth");

        setTitle("BoxLayoutDemoOne");
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BoxLayoutDemoOne();
    }
}
