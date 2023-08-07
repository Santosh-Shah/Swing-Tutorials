package lab_reports.labone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    private JTextField idField, nameField, emailField, addressField, contactField;
    private JComboBox<String> countryComboBox;
    private JRadioButton maleRadioButton, femaleRadioButton, otherRadioButton;
    private JButton submitButton;
    private JTextArea enteredInfoTextArea;

    public StudentRegistrationForm() {
        // Set frame properties
        setTitle("Student Registration");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create main form panel
        JPanel formPanel = new JPanel(new GridLayout(9, 2));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create form fields
        formPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        formPanel.add(idField);

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        formPanel.add(emailField);

        formPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        formPanel.add(addressField);

        formPanel.add(new JLabel("Contact:"));
        contactField = new JTextField();
        formPanel.add(contactField);

        formPanel.add(new JLabel("City:"));
        JTextField cityField = new JTextField();
        formPanel.add(cityField);

        formPanel.add(new JLabel("Country:"));
        String[] countries = {"Nepal", "India", "America", "Australia", "Canada", "Other"};
        countryComboBox = new JComboBox<>(countries);
        formPanel.add(countryComboBox);

        formPanel.add(new JLabel("Gender:"));
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        otherRadioButton = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderGroup.add(otherRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        genderPanel.add(otherRadioButton);
        formPanel.add(genderPanel);

        // Create submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Create entered information panel
        JPanel infoPanel = new JPanel(new GridLayout(9, 2));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        infoPanel.add(new JLabel("Entered Information:"));
        enteredInfoTextArea = new JTextArea();
        enteredInfoTextArea.setEditable(false);
        infoPanel.add(enteredInfoTextArea);

        // Add components to the frame
        add(formPanel, BorderLayout.NORTH);
        add(submitButton, BorderLayout.CENTER);
        add(infoPanel, BorderLayout.SOUTH);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistrationForm();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Retrieve entered information
            String id = idField.getText();
            String name = nameField.getText();
            String email = emailField.getText();
            String address = addressField.getText();
            String contact = contactField.getText();
            String country = (String) countryComboBox.getSelectedItem();
            String gender = "";
            if (maleRadioButton.isSelected()) {
                gender = "Male";
            } else if (femaleRadioButton.isSelected()) {
                gender = "Female";
            } else if (otherRadioButton.isSelected()) {
                gender = "Other";
            }

            // Display entered information
            enteredInfoTextArea.setText("ID: " + id
                    + "\nName: " + name
                    + "\nEmail: " + email
                    + "\nAddress: " + address
                    + "\nContact: " + contact
                    + "\nCountry: " + country
                    + "\nGender: " + gender);
        }
    }
}