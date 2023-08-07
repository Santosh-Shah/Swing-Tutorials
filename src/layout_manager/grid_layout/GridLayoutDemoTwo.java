package layout_manager.grid_layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemoTwo extends JFrame {
//    Example of GridLayout class: Using GridLayout(int rows, int columns) Constructor
    JButton btn1, btn2, btn3, btn4, btn5;

    GridLayoutDemoTwo() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");


        setTitle("GridLayoutDemoOne");
        // setting grid layout of 2 rows and 3 columns
        setLayout(new GridLayout(2, 3));
        setSize(500, 500);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GridLayoutDemoTwo();
    }
}
