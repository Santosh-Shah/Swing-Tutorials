package layout_manager.border_layout;

import javax.swing.*;
import java.awt.*;

public class BorderDemoThird extends JFrame {

    // BorderLayout without putting Horizontal and Vertical gaps in it
    JButton b1, b2, b3, b4, b5;
    BorderDemoThird() {
        b1 = new JButton("East Side");
        b2 = new JButton("West Side");
        b3 = new JButton("North Side");
        b4 = new JButton("South Side");
        b5 = new JButton("Center Side");

        setLayout(new BorderLayout(7, 7));
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
        new BorderDemoThird();
    }
}
