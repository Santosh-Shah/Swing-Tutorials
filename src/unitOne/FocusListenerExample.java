package unitOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.EventListener;

public class FocusListenerExample extends JFrame implements FocusListener {
    JLabel fn_lbl, sn_lbl, res_lbl, key_lbl;// JLabel references
    JTextField fn_txt, sn_txt, res_txt, key_txt;// JTextField references
    JButton jButton;

    public FocusListenerExample() {
        setTitle("Plus Minus Frame");// sets title to JFrame
        setSize(400, 400);// sets size of Jframe
        setLayout(new GridLayout(4, 2, 5, 5));// sets layout to JFrame
// creating objects of references declared above the constructor
        fn_lbl = new JLabel("Firstnum");
        sn_lbl = new JLabel("Secondnum");
        res_lbl = new JLabel("Result");
        key_lbl = new JLabel("Enter Key");
        fn_txt = new JTextField(20);// 20 is the size of JTextField
        sn_txt = new JTextField(20);
        res_txt = new JTextField(20);
        key_txt = new JTextField(20);
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
