package unitOne;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("My First GUI");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//        JButton button1 = new JButton("Press");
//        frame.getContentPane().add(button1);
//        frame.setVisible(true);

        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }
}