package layout_manager.grid_layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemoOne extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5;

    GridLayoutDemoOne() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");


        setTitle("GridLayoutDemoOne");
        setSize(500, 500);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        setVisible(true);
        setLayout(new GridLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GridLayoutDemoOne();
    }
}
