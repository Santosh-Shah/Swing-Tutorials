package unitOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;

public class ItemEventDemo extends JFrame implements ItemListener {
    private JRadioButton rb1, rb2, rb3;
    private JComboBox<String> cb;
    private ButtonGroup group;

    public static void main(String[] args) {
        new ItemEventDemo();
    }
    public ItemEventDemo() {
        group = new ButtonGroup();
        rb1 = new JRadioButton("Male");
        rb1.addItemListener(this);
        rb2 = new JRadioButton("Female");
        rb2.addItemListener(this);
        rb3 = new JRadioButton("Not Specified");
        rb3.addItemListener(this);
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        String country[] = {"Nepal", "Indian", "America", "Canada"};
        cb = new JComboBox<>(country);
        cb.addItemListener(this);
        setTitle("Item Event Frame");
        setLayout(new FlowLayout());
        add(rb1);
        add(rb2);
        add(rb3);
        add(cb);
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == rb1 && rb1.isSelected() == true) {
            JOptionPane.showMessageDialog(this, rb1.getText());
        }

        if (e.getSource() == rb2 && rb2.isSelected() == true) {
            JOptionPane.showMessageDialog(this, rb2.getText());
        }

        if (e.getSource() == rb3 && rb3.isSelected() == true) {
            JOptionPane.showMessageDialog(this, rb3.getText());
        }

        if (e.getSource() == cb && e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(this, cb.getSelectedItem());
        }

//        if (e.getSource() == cb && e.getStateChange() == ItemEvent.DESELECTED) {
//            JOptionPane.showMessageDialog(this, "No items are selected in combo-box");
//        }
    }
}
