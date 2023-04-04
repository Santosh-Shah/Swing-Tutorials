package swingPractice;

import javax.swing.*;

public class FirstProgram {
    JFrame jFrame;
    JButton jButton;


    FirstProgram() {
        jFrame = new JFrame();
        jButton = new JButton("Click Here");
        jFrame.add(jButton);
        jButton.setBounds(170, 200, 100, 60);
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new FirstProgram();
    }
}
