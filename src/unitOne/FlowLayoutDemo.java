package unitOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutDemo extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, switchLayout;
    FlowLayout l1, l2;
    Container cont;

    FlowLayoutDemo() {
        cont = getContentPane();
        b1 = new JButton("Button One");
        b2 = new JButton("Button Two");
        b3 = new JButton("Button Three");
        b4 = new JButton("Button Four");
        b5 = new JButton("Button Five");
        switchLayout = new JButton("Switch");
        switchLayout.addActionListener(this);
        l1 = new FlowLayout();
        l2 = new FlowLayout(FlowLayout.LEFT, 10, 10);
        setTitle("FlowLayout Example");
        cont.setBackground(Color.GREEN);
        cont.setLayout(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(switchLayout);
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
            new FlowLayoutDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cont.setLayout(l2);
        cont.setBackground(Color.blue);
        cont.validate();
    }
}
