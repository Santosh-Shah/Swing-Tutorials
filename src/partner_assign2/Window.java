package partner_assign2;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Window extends JFrame{

    // Modify the above program and use the Grid Layout, Flow Layout, Border Layout and Grid Bag Layout.
    private static final long serialVersionUID = 1L;
    JLabel lblName, lblMobile, lblGender, lblDob, lblAddress;
    JTextField txtName, txtMobile;
    JTextArea txtAddress;
    JRadioButton rdgenderMale, rdgenderFeMale, rdgenderOther;
    JComboBox<String> day, month, year;
    JCheckBox chkAccept;
    JButton btn_submit;
    ButtonGroup gender_group;
    Container container;
    public Window() {
        container = this.getContentPane();
        lblName = new JLabel("Name : ");
        lblName.setBounds(10, 10, 100, 30);
        txtName = new JTextField();
        txtName.setBounds(110, 10, 200, 30);
        lblGender = new JLabel("Gender : ");
        lblGender.setBounds(10, 50, 100, 30);
        rdgenderMale = new JRadioButton("Male");
        rdgenderMale.setBounds(110, 50, 60, 30);
        rdgenderMale.setActionCommand("Male");

        rdgenderFeMale = new JRadioButton("FeMale");
        rdgenderFeMale.setBounds(170, 50, 80, 30);
        rdgenderFeMale.setActionCommand("FeMale");
        rdgenderOther = new JRadioButton("Other");
        rdgenderOther.setBounds(250, 50, 130, 30);
        rdgenderOther.setActionCommand("Other");
        gender_group = new ButtonGroup();
        gender_group.add(rdgenderMale);
        gender_group.add(rdgenderFeMale);
        gender_group.add(rdgenderOther);
        lblDob = new JLabel("DOB : ");
        lblDob.setBounds(10, 90, 100, 30);
        String[] day_data = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String[] month_data = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        String[] year_data = { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
                "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
                "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
                "2017", "2018", "2019", "2020", "2021" };
        day = new JComboBox<String>(day_data);
        day.setBounds(110, 90, 50, 30);
        month = new JComboBox<String>(month_data);
        month.setBounds(180, 90, 50, 30);
        year = new JComboBox<String>(year_data);
        year.setBounds(250, 90, 70, 30);
        lblAddress = new JLabel("Address : ");
        lblAddress.setBounds(10, 140, 100, 30);
        txtAddress = new JTextArea();
        txtAddress.setBounds(110, 140, 200, 50);
        lblMobile = new JLabel("Mobile : ");
        lblMobile.setBounds(10, 210, 100, 30);
        txtMobile = new JTextField();
        txtMobile.setBounds(110, 210, 200, 30);
        chkAccept = new JCheckBox("Accept terms and condition!");
        chkAccept.setBounds(60, 260, 200, 30);
        btn_submit = new JButton("Register");
        btn_submit.setBounds(100, 330, 110, 30);
        container.add(lblName);

        container.add(txtName);
        container.add(lblGender);
        container.add(rdgenderMale);
        container.add(rdgenderFeMale);
        container.add(rdgenderOther);
        container.add(lblDob);
        container.add(day);
        container.add(month);
        container.add(year);
        container.add(lblAddress);
        container.add(txtAddress);
        container.add(lblMobile);
        container.add(txtMobile);
        container.add(chkAccept);
        container.add(btn_submit);



        setBounds(10, 10, 400, 450);
        setLayout(null);
        setTitle("Texas Registration Form");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Window();
    }
}
