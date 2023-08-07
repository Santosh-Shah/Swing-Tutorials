package unitOne;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterDemonstration extends WindowAdapter {
    JFrame jFrame;
    public WindowAdapterDemonstration() {
        jFrame = new JFrame();
        jFrame.setTitle("Window Adapter Frame");
        jFrame.addWindowListener(this);
        jFrame.setVisible(true);
        jFrame.setSize(400, 400);
        jFrame.setLayout(null);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(jFrame, "Welcome");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(jFrame, "Are you sure to exit?");
    }
    public static void main(String[] args) {
        new WindowAdapterDemonstration();
    }
}
