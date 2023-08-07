package unitOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends JFrame implements MouseListener {
    JLabel infolbl;
    public static void main(String[] args) {
        new MouseEventDemo();
    }

    MouseEventDemo() {
        infolbl = new JLabel("Information Here");
        add(infolbl, BorderLayout.SOUTH);
        setTitle("Mouse Frame");
        setSize(400, 400);
        addMouseListener(this);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        infolbl.setText("Clicked at: [" + e.getX() + ", " + e.getY() + "]");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        infolbl.setText("Pressed at: [" + e.getX() + ", " + e.getY() + "]");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        infolbl.setText("Released at: [" + e.getX() + ", " + e.getY() + "]");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
