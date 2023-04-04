package unitOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingUse extends JFrame {
    JLabel userLbl, passLbl, conPassLbl;
    JTextField userTxt;
    JPasswordField passTxt, conPassTxt;
    JButton submit;
    SwingUse() {
        userLbl = new JLabel("UserName");
        passLbl = new JLabel("Password");
        conPassLbl = new JLabel("Confirm Password");
        userTxt = new JTextField(20);
        passTxt = new JPasswordField(20);
        conPassTxt = new JPasswordField(20);
        submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String p = passTxt.getText();
                String cp = conPassTxt.getText();
                if (p.equals(cp)) {
                    JOptionPane.showMessageDialog(SwingUse.this, "Both password are matching");
                } else {
                    JOptionPane.showMessageDialog(SwingUse.this, "Both password are not matching");
                }
            }
        });
        
        setTitle("Swing JFrame");           //it sets title to the main window
        setLayout(new GridLayout(4,2,5,5));        // it arranges components from left ot right
        setSize(300, 300);      // pixels, width and height
        add(userLbl);
        add(userTxt);
        add(passLbl);
        add(passTxt);
        add(conPassLbl);
        add(conPassTxt);
        add(new JLabel());
        add(submit);
//        setResizable(false);              // fixed width and height JFrame
        setVisible(true);                   // it displays or shows the JFrame on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // terminated background running
    }
    public static void main(String[] args) {
        new SwingUse();
    }
}
