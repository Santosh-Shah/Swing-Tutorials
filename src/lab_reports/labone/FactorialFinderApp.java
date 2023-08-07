package lab_reports.labone;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialFinderApp extends JFrame implements ActionListener{

    public JTextField getNumber;
    public JButton click;
    public JLabel factOutput;

    public FactorialFinderApp() {
        setTitle("Factorial Finder App");
        getNumber=new JTextField();
        getNumber.setBounds(120,100, 50,30);
        add(getNumber);

        click = new JButton("Find Factorial");
        click.setBounds(90, 150, 150, 30);
        click.addActionListener(this);
        add(click);

        factOutput = new JLabel("Factorial result:");
        factOutput.setBounds(110, 200, 150, 30);
        add(factOutput);


        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Find Factorial")) {
            try {
                // Parse the number from the text field
                int number = Integer.parseInt(getNumber.getText());

                // Calculate the factorial
                long factorial = findFactorial(number);

                // Display the result
                factOutput.setText("Factorial result: " + factorial);
            } catch (NumberFormatException ex) {
                factOutput.setText("!Please Enter Valid Number");
            }
        }
    }



    // function to calculate factorial using recursion
    public static long findFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * findFactorial(num - 1);
    }
    public static void main(String[] args) {
        new FactorialFinderApp();
    }
}
