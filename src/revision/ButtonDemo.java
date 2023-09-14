package revision;

import javax.swing.*;

public class ButtonDemo extends JFrame {
    JFrame frame;
    JButton btn;

    ButtonDemo() {
        frame = new JFrame("Button Demo");

        btn = new JButton("Click");
        btn.setBounds(150, 200, 130, 50);
        frame.add(btn);

        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }

}
