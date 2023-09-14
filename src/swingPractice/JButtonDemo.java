package swingPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo extends JFrame {
    JFrame jFrame;
    JTextField jTxt;
    JButton jBtn1;

    //TODO: Creating JButton
//    JButtonDemo() {
//        jFrame = new JFrame("Button Example");
//        jBtn1 = new JButton("Button Example");
//
//        jBtn1.setBounds(50, 100, 200, 30);
//        add(jBtn1);
//        setSize(500, 600);
//        setLayout(null);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }

    //TODO: Create JButton with ActionListener
//    JButtonDemo() {
//        jFrame = new JFrame("Button Demo with ActionListener");
//
//        jTxt = new JTextField();
//        jTxt.setBounds(50, 50, 150, 20);
//
//        jBtn1 = new JButton("Click Here");
//        jBtn1.setBounds(75, 80, 100, 30);
//        jBtn1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jTxt.setText("Welcome to JTextField");
//            }
//        });
//        add(jBtn1);
//        add(jTxt);
//        setSize(400, 400);
//        setLayout(null);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }

    //TODO: Displaying image on the button
    JButtonDemo() {
        jFrame = new JFrame("Displaying image on the Button");

        jBtn1 = new JButton(new ImageIcon("C:\\Users\\user\\Downloads\\14603088.jpg"));
//        jBtn1 = new JButton();
//        jBtn1.setIcon("");
//        jBtn1.setMnemonic(4000000);
//        jBtn1.setText("Hello Button");
        jBtn1.setBounds(50, 100, 200, 100);

        add(jBtn1);
        setSize(500,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
