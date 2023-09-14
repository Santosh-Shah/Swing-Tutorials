package revision;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionDemo extends JFrame implements ActionListener {
    JFrame frame;
    JButton btn1, btn2;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;

    AdditionDemo() {
        frame = new JFrame("Calculation Demo");

        // Creating two textfield to take two integer numbers
        textField1 = new JTextField();
        textField1.setBounds(50, 50, 150, 20 );
        frame.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(50, 100, 150, 20);
        frame.add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(50, 150, 150, 20);
        textField3.setEditable(false);
        frame.add(textField3);

        btn1 = new JButton("+");
        btn1.setBounds(50, 200, 50, 50);
        btn1.addActionListener(this);
        frame.add(btn1);

        btn2 = new JButton("-");
        btn2.setBounds(120, 200, 50, 50);
        btn2.addActionListener(this);
        frame.add(btn2);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String st1= textField1.getText();
        String st2 = textField2.getText();
        int a = Integer.parseInt(st1);
        int b = Integer.parseInt(st2);
        int c = 0;

        if (e.getSource() == btn1) {
            c = a + b;
        }

        if (e.getSource() == btn2) {
            c = a - b;
        }

        String ans = String.valueOf(c);
        textField3.setText(ans);
    }


    public static void main(String[] args) {
        new AdditionDemo();
    }
}
