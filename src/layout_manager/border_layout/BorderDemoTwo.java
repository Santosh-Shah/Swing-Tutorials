package layout_manager.border_layout;

import javax.swing.*;
import java.awt.*;

public class BorderDemoTwo extends JFrame {

    // BorderLayout with putting Horizontal and Vertical gaps in it

    JButton b1, b2, b3, b4, b5;
    BorderDemoTwo() {
        b1 = new JButton("East Side");
        b2 = new JButton("West Side");
        b3 = new JButton("North Side");
        b4 = new JButton("South Side");
        b5 = new JButton("Center Side");

        setLayout(new BorderLayout(15, 55));
        add(b1, BorderLayout.EAST);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.NORTH);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderDemoTwo();
    }
}
