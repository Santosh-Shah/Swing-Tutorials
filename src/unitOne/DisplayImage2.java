package unitOne;

import javax.swing.*;
import java.awt.*;

public class DisplayImage2 extends JFrame {
    JLabel iconLbl;

    DisplayImage2() {
        iconLbl = new JLabel();
        Icon ic = new ImageIcon("C:\\Users\\user\\Desktop\\Logo.png");
        iconLbl.setIcon(ic);

        //JFrame Configuration
        setTitle("Display Image");
        setSize(300, 300);
        setLayout(new BorderLayout());
        add(iconLbl, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DisplayImage2();
    }
}
