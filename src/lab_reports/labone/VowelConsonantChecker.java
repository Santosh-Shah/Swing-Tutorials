package lab_reports.labone;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VowelConsonantChecker implements KeyListener {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vowel Consonant Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JOptionPane.showMessageDialog(frame, "Enter a character.");

        frame.addKeyListener(new VowelConsonantChecker());
        frame.setFocusable(true);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (Character.isLetter(c)) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                JOptionPane.showMessageDialog(null, "The entered character is a vowel.");
            } else {
                JOptionPane.showMessageDialog(null, "The entered character is a consonant.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid character.");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // No implementation needed
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No implementation needed
    }
}

