package unitOne;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventDemonstration extends JFrame implements WindowListener {
    public WindowEventDemonstration() {
        setTitle("Window Frame");
        addWindowListener(this);


        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new WindowEventDemonstration();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "Welcome Guys");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "Are you sure to exit?");
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "See you later Guys");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(this, "Welcome Back Guys");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window is Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is Deactivated");
    }
}
