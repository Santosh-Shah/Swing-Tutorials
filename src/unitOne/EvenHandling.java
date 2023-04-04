package unitOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenHandling extends JFrame{
    JButton bt1, bt2;

    EvenHandling() {
        bt1 = new JButton("ButtonOne");
        bt2 = new JButton("ButtonTwo");
        bt2.addActionListener(e->System.exit(0));
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setSize(200, 200);
        setLayout(new FlowLayout());
        add(bt1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EvenHandling();
    }
}
