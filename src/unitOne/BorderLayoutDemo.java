package unitOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutDemo extends JFrame implements ActionListener {
    JButton north, south, west, east, centerChangeLayout;
    BorderLayout bl1, bl2;
    Container cont;

    BorderLayoutDemo() {
        cont = getContentPane();
        north = new JButton("NORTH");
        north.addActionListener(this);

        south = new JButton("SOUTH");
        south.addActionListener(this);

        west = new JButton("WEST");
        west.addActionListener(this);

        east = new JButton("EAST");
        east.addActionListener(this);

        centerChangeLayout = new JButton("CENTER");
        centerChangeLayout.addActionListener(this);

        bl1 = new BorderLayout();
        bl2 = new BorderLayout(10, 10);
        cont.setLayout(bl1);

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(centerChangeLayout, BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == centerChangeLayout) {
            cont.setLayout(bl2);
            cont.validate();
        } else if (e.getSource() == north) {
            north.setVisible(false);
        } else if (e.getSource() == west) {
            west.setVisible(false);
        } else if (e.getSource() == east) {
            east.setVisible(false);
        } else {
            south.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
