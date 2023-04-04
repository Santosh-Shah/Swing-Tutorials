package unitOne;

import javax.swing.*;
import java.awt.*;

public class GUIFirstTest extends JFrame {
    JLabel stdLbl, addLbl, conLbl, eLbl;
    JTextField stdTxt, addTxt, conTxt, eTxt;
//    JPasswordField passTxt, conPassTxt;
    JButton subBtn, reBtn;

    GUIFirstTest() {
        stdLbl = new JLabel("Student Name");
        addLbl = new JLabel("Student Address");
        conLbl = new JLabel("Contact Number");
        eLbl = new JLabel("Email Address");

        stdTxt = new JTextField(20);
        addTxt = new JTextField(20);
        conTxt = new JTextField(20);
        eTxt = new JTextField(20);
        subBtn = new JButton("Submit Button");
        reBtn = new JButton("Reset Button");
//        reBtn.setBounds(100,10,200,5);
//        subBtn.setBounds(140, 170, 120, 20);


        setTitle("Student Info Form");
        setLayout(new GridLayout(5,2,5,5));        // it arranges components from left ot right
        setSize(300, 300);      // pixels, width and height
        add(stdLbl);
        add(stdTxt);
        add(addLbl);
        add(addTxt);
        add(conLbl);
        add(conTxt);
        add(eLbl);
        add(eTxt);
//        add(new JLabel());
        add(subBtn);
        add(reBtn);
//        setResizable(false);              // fixed width and height JFrame
        setVisible(true);                   // it displays or shows the JFrame on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GUIFirstTest();
    }
}
