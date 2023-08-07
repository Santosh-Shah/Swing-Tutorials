package swingPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo extends JFrame{
    // TODO: Making Simple Calculator
    JFrame jFrame;
    JTextField jTxt1, jTxt2, jTxt3;
    JButton plusBtn, minusBtn, mltBtn, divBtb, remBtn;

    JTextFieldDemo() {
        setTitle("Simple Calculator");
        jTxt1 = new JTextField();
        jTxt1.setBounds(50, 100, 230, 30);

        jTxt2 = new JTextField();
        jTxt2.setBounds(50, 130, 230, 30);

        jTxt3 = new JTextField();
        jTxt3.setBounds(50, 160, 230, 30);

        plusBtn = new JButton("+");
        plusBtn.setBounds(50,200,45,40);
        plusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputOne = Integer.parseInt(jTxt1.getText());
                int inputTwo = Integer.parseInt(jTxt2.getText());
                int output = inputOne + inputTwo;
                jTxt3.setText(String.valueOf(output));
            }
        });

        minusBtn = new JButton("-");
        minusBtn.setBounds(100,200,45,40);
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputOne = Integer.parseInt(jTxt1.getText());
                int inputTwo = Integer.parseInt(jTxt2.getText());
                int output = inputOne - inputTwo;
                jTxt3.setText(String.valueOf(output));
            }
        });

        mltBtn = new JButton("*");
        mltBtn.setBounds(150,200,45,40);
        mltBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputOne = Integer.parseInt(jTxt1.getText());
                int inputTwo = Integer.parseInt(jTxt2.getText());
                int output = inputOne * inputTwo;
                jTxt3.setText(String.valueOf(output));
            }
        });

        divBtb = new JButton("/");
        divBtb.setBounds(200,200,45,40);
        divBtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputOne = Integer.parseInt(jTxt1.getText());
                int inputTwo = Integer.parseInt(jTxt2.getText());
                float output = (float) inputOne / inputTwo;
                jTxt3.setText(String.valueOf(output));
            }
        });


        add(jTxt1);
        add(jTxt2);
        add(jTxt3);
        add(plusBtn);
        add(minusBtn);
        add(mltBtn);
        add(divBtb);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {

        new JTextFieldDemo();



        // TODO: Example One
//        JFrame jFrame = new JFrame("TextField Example");
//        JTextField jTextField1 = new JTextField("Welcome to Vedas College...");
//        jTextField1.setBounds(50, 100, 230, 30);
//
//        JTextField jTextField2 = new JTextField("Welcome to National Infotech College...");
//        jTextField2.setBounds(50, 150, 230, 30);
//
//        jFrame.add(jTextField1);
//        jFrame.add(jTextField2);
//        jFrame.setSize(400, 400);
//        jFrame.setLayout(null);
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
