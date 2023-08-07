package lab_reports.labone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileChooserColorChooserExample extends JFrame {

    private JTextArea textArea;
    private JFileChooser fileChooser;
    private JColorChooser colorChooser;

    public FileChooserColorChooserExample() {
        setTitle("File and Color Chooser Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create the file menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        // Create the toolbar
        JToolBar toolBar = new JToolBar();
        add(toolBar, BorderLayout.NORTH);

        // Create the text area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Create the file chooser
        fileChooser = new JFileChooser();

        // Create the color chooser
        colorChooser = new JColorChooser();

        // Create the "Open" menu item and toolbar button
        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        fileMenu.add(openMenuItem);

        JButton openButton = new JButton(new ImageIcon("open.png"));
        openButton.setToolTipText("Open");
        openButton.addActionListener(e -> openFile());
        toolBar.add(openButton);

        // Create the "Save" menu item and toolbar button
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        fileMenu.add(saveMenuItem);

        JButton saveButton = new JButton(new ImageIcon("save.png"));
        saveButton.setToolTipText("Save");
        saveButton.addActionListener(e -> saveFile());
        toolBar.add(saveButton);

        // Create the "Choose Color" menu item and toolbar button
        JMenuItem chooseColorMenuItem = new JMenuItem("Choose Color");
        chooseColorMenuItem.setMnemonic(KeyEvent.VK_C);
        chooseColorMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        fileMenu.add(chooseColorMenuItem);

        JButton chooseColorButton = new JButton(new ImageIcon("color.png"));
        chooseColorButton.setToolTipText("Choose Color");
        chooseColorButton.addActionListener(e -> chooseColor());
        toolBar.add(chooseColorButton);

        setVisible(true);
    }

    private void openFile() {
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            // Code to handle opening the file
            textArea.setText("Opening file: " + file.getName());
        }
    }

    private void saveFile() {
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            // Code to handle saving the file
            textArea.append("\nSaving file: " + file.getName());
        }
    }

    private void chooseColor() {
        Color color = JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
        if (color != null) {
            // Code to handle the chosen color
            textArea.setForeground(color);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileChooserColorChooserExample();
            }
        });
    }
}
