package lab_reports;

import javax.swing.*;

public class RegistrationForm extends JFrame {
    JLabel lbl_name, lbl_email, lbl_phone, lbl_password, lbl_confirm,
            lbl_country, lbl_Gender, lbl_lang, lbl_abtY;
    JTextField tf_name, tf_email, tf_phone, tf_password, tf_confirm;
    JComboBox cmb_country;
    ButtonGroup bg_gender;
    JRadioButton r_btn_male, r_btn_female, r_btn_others;
    JCheckBox c_box_1, c_box_2, c_box_3;
    JTextArea txt_area_abtY;
    JButton btn_reg;
    RegistrationForm() {
        // for name
        lbl_name = new JLabel("Name:");
        lbl_name.setBounds(50, 35, 100, 30);
        add(lbl_name);
        tf_name = new JTextField();
        tf_name.setBounds(155, 37, 270, 24);
        add(tf_name);

        // for E-mail
        lbl_email = new JLabel("E-mail:");
        lbl_email.setBounds(50, 73, 100, 30);
        add(lbl_email);
        tf_email = new JTextField();
        tf_email.setBounds(155, 77, 270, 24);
        add(tf_email);

        // for Phone
        lbl_phone = new JLabel("Phone:");
        lbl_phone.setBounds(50, 110, 100, 30);
        add(lbl_phone);
        tf_phone = new JTextField();
        tf_phone.setBounds(155, 114, 270, 24);
        add(tf_phone);

        // for password
        lbl_password = new JLabel("Password:");
        lbl_password.setBounds(50, 147, 100, 30);
        add(lbl_password);
        tf_password = new JTextField();
        tf_password.setBounds(155, 150, 270, 24);
        add(tf_password);

//         for confirm
        lbl_confirm = new JLabel("Confirm:");
        lbl_confirm.setBounds(50, 185, 100, 30);
        add(lbl_confirm);
        tf_confirm = new JTextField();
        tf_confirm.setBounds(155, 189, 270, 24);
        add(tf_confirm);

//        for Country
        lbl_country = new JLabel("Country:");
        lbl_country.setBounds(50, 225, 100, 30);
        add(lbl_country);

        String country[] = {"Select...", "Nepal", "India", "America", "Canada", "Australia"};
        cmb_country = new JComboBox(country);
        cmb_country.setBounds(155, 230, 90, 24);
        add(cmb_country);

//        for Gender
        lbl_Gender = new JLabel("Gender:");
        lbl_Gender.setBounds(50, 263, 100, 30);
        add(lbl_Gender);

        bg_gender = new ButtonGroup();
        r_btn_male = new JRadioButton("Male");
        r_btn_male.setBounds(155, 265, 80, 30);
        bg_gender.add(r_btn_male);
        add(r_btn_male);

        r_btn_female = new JRadioButton("Female");
        r_btn_female.setBounds(235, 265, 80, 30);
        bg_gender.add(r_btn_female);
        add(r_btn_female);

        r_btn_others = new JRadioButton("Others");
        r_btn_others.setBounds(320, 265, 80, 30);
        bg_gender.add(r_btn_others);
        add(r_btn_others);

//        for language
        lbl_lang = new JLabel("Language:");
        lbl_lang.setBounds(50, 300, 100, 30);
        add(lbl_lang);

        c_box_1 = new JCheckBox("Arabic");
        c_box_1.setBounds(155, 300, 80, 30);
        add(c_box_1);

        c_box_2 = new JCheckBox("English");
        c_box_2.setBounds(235, 300, 80, 30);
        add(c_box_2);

        c_box_3 = new JCheckBox("Spanish");
        c_box_3.setBounds(320, 300, 80, 30);
        add(c_box_3);

//        for about you
        lbl_abtY = new JLabel("About You:");
        lbl_abtY.setBounds(50, 350, 100, 30);
        add(lbl_abtY);

//        for about you JTextArea
        txt_area_abtY = new JTextArea("Your Biography...");
        txt_area_abtY.setBounds(155, 340, 272, 65);
        add(txt_area_abtY);

//          for register button
        btn_reg = new JButton("Register");
        btn_reg.setBounds(50, 428, 380, 25);
        add(btn_reg);


        setTitle("Registration Form");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new RegistrationForm();
    }
}
