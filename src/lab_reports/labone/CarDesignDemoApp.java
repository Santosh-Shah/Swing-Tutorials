package lab_reports.labone;

import javax.swing.*;
import java.awt.*;

public class CarDesignDemoApp extends Canvas {

    public CarDesignDemoApp() {
        setSize(400, 300);
    }

    public void paint(Graphics g) {
        // Draw car body
        g.setColor(Color.red);
        g.fillRect(50, 100, 300, 100);

        // Draw wheels
        g.setColor(Color.black);
        g.fillOval(75, 180, 50, 50);
        g.fillOval(275, 180, 50, 50);

        // Label the parts of the car
        Font font = new Font("Arial", Font.BOLD, 14);
        g.setFont(font);
        g.setColor(Color.white);
        g.drawString("Front Wheel", 65, 250);
        g.drawString("Rear Wheel", 270, 250);
        g.drawString("Vedas Van", 185, 160);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Design");
        CarDesignDemoApp canvas = new CarDesignDemoApp();
        frame.add(canvas);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
