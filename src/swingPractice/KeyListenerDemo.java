package swingPractice;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo extends JFrame implements KeyListener {

    private JLabel jLabel;
    private JTextArea jTextArea;

    public KeyListenerDemo() {
        setTitle("Key Listener App");

        jLabel = new JLabel();
        jLabel.setBounds(20, 50, 100, 20);
        add(jLabel);

        jTextArea = new JTextArea();
        jTextArea.setBounds (20, 80, 300, 300);
        jTextArea.addKeyListener(this);
        add(jTextArea);


        setSize(400, 400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        jLabel.setText("keyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        jLabel.setText("KeyPressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        jLabel.setText("Key Released");
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
}
