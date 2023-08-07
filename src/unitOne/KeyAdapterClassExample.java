package unitOne;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyAdapterClassExample extends JFrame{

    JLabel fn_lbl, sn_lbl, res_lbl, key_lbl;// JLabel references
    JTextField fn_txt, sn_txt, res_txt, key_txt;// JTextField references

    public KeyAdapterClassExample() {
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
        KeyAdapter list = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int f = Integer.parseInt(fn_txt.getText());// string to int conversion
                int s = Integer.parseInt(sn_txt.getText());
                int r = 0;
                if (e.getKeyChar() == 'a') {
                    r = f + s;
                } else if (e.getKeyChar() == 's') {
                    r = f - s;
                } else if (e.getKeyChar() == 'm') {
                    r = f * s;
                } else if (e.getKeyChar() == 'r') {
                    r = f % s;
                } else if (e.getKeyChar() == 'd') {
                    r = f / s;
                } else {
                    res_txt.setText("Invalid Entry");
                }
                res_txt.setText(String.valueOf(r));
            }
        };
        key_txt.addKeyListener(list);
// components are added to JFrame i.e. container
        add(fn_lbl);
        add(fn_txt);
        add(sn_lbl);
        add(sn_txt);
        add(key_lbl);
        add(key_txt);
        add(res_lbl);
        add(res_txt);
        setVisible(true);// display JFrame on screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
            new KeyAdapterClassExample();
    }
}
