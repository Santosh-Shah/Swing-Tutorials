package partner_assign2;

import javax.swing.*;
import java.awt.*;

public class TexasRegistrationFormDemo extends JFrame {
    private JLabel nameLabel, genderLabel, dobLabel, addressLabel, mobileLabel;
    private JTextField nameField, mobileField;
    private JRadioButton rdGenderMale, rdGenderFemale, rdGenderOther;
    private JComboBox<String> day, month, year;
    private JTextArea addressArea;
    private JButton registerButton;
    private JCheckBox chkAccept;
    private ButtonGroup genderGroup;


    //TODO: Constructor
    public TexasRegistrationFormDemo() {
        setTitle("Texas Registration Form");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //TODO: Create components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        addressLabel = new JLabel("Address:");
        addressArea = new JTextArea();

        mobileLabel = new JLabel("Mobile:");
        mobileField = new JTextField(20);


        //TODO: for gender components
        genderLabel = new JLabel("Gender");
        rdGenderMale = new JRadioButton("Male");
        rdGenderFemale = new JRadioButton("Female");
        rdGenderOther = new JRadioButton("Other");

        genderGroup = new ButtonGroup();
        genderGroup.add(rdGenderMale);
        genderGroup.add(rdGenderFemale);
        genderGroup.add(rdGenderOther);

        JPanel genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(rdGenderMale);
        genderPanel.add(rdGenderFemale);
        genderPanel.add(rdGenderOther);


        //TODO: for DOB component
        dobLabel = new JLabel("DOB:");
        String[] day_data = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String[] month_data = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        String[] year_data = { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
                "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
                "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
                "2017", "2018", "2019", "2020", "2021" };
        day = new JComboBox<String>(day_data);
        month = new JComboBox<String>(month_data);
        year = new JComboBox<String>(year_data);

        JPanel formPanelDob = new JPanel(new FlowLayout());
        formPanelDob.add(day);
        formPanelDob.add(month);
        formPanelDob.add(year);


        //TODO: for check box component
        chkAccept = new JCheckBox("Accept terms and condition!");
        JPanel formPanelCheckBox = new JPanel(new FlowLayout());
        formPanelCheckBox.add(chkAccept);

        //TODO: for register button component
        registerButton = new JButton("Register");
        JPanel formPanelButton = new JPanel(new FlowLayout());
        formPanelButton.add(registerButton);

        //TODO: JFrame work as border layout manager
        setLayout(new BorderLayout());

        //TODO: using JPanel as GridLayout to add all above created components
        JPanel formPanelOne = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanelOne.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        formPanelOne.add(nameLabel);
        formPanelOne.add(nameField);
        formPanelOne.add(genderLabel);
        formPanelOne.add(genderPanel);
        formPanelOne.add(dobLabel);
        formPanelOne.add(formPanelDob);
        formPanelOne.add(addressLabel);
        formPanelOne.add(addressArea);
        formPanelOne.add(mobileLabel);
        formPanelOne.add(mobileField);
        formPanelOne.add(formPanelCheckBox);


        //TODO: adding all above layouts in JFrame as Border Layout Manager
        add(formPanelOne, BorderLayout.CENTER);
//        add(genderPanel, BorderLayout.SOUTH);
//        add(formPanelCheckBox, BorderLayout.SOUTH);
        add(formPanelButton, BorderLayout.SOUTH);
        pack();  // It will manage the frame size according to components
    }

    public static void main(String[] args) {
        TexasRegistrationFormDemo form = new TexasRegistrationFormDemo();
        form.setVisible(true);
    }
}
