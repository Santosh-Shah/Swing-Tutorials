package swingPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class JLabelDemo extends JFrame {
    JFrame jFrame;
    JLabel jLbl1, jLbl2;
    JButton jBtn1;
    JTextField jTxt1;

//    JLabelDemo() {
//        jFrame = new JFrame("JLabel Example");
//
//        jLbl1 = new JLabel("First Label");
//        jLbl1.setBounds(100, 150, 100, 50);
//
//        jLbl2 = new JLabel("Second Label");
//        jLbl2.setBounds(100, 170, 100, 50);
//
//        add(jLbl1);
//        add(jLbl2);
//        setSize(300, 300);
//        setLayout(null);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }

    //TODO: JLabel example with ActionListener
    JLabelDemo() {
        jFrame = new JFrame();

        jTxt1 = new JTextField();
        jTxt1.setBounds(50,50, 200,20);

        jLbl1 = new JLabel();
        jLbl1.setBounds(50,100, 350,20);

        jBtn1 = new JButton("Click Here");
        jBtn1.setBounds(50,150,95,30);
        jBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String host = jTxt1.getText();
                    InetAddress ip = InetAddress.getByName(host);
                    String ipAddress = ip.getHostAddress();
                    jLbl1.setText("IP Address of " + host + " is: " + ipAddress);

//                    String host=jTxt1.getText();
//                    String ip=java.net.InetAddress.getByName(host).getHostAddress();
//                    jLbl1.setText("IP of "+host+" is: "+ip);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });

        setTitle("JFrame Example");
        add(jTxt1);
        add(jLbl1);
        add(jBtn1);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JLabelDemo();
    }
}
