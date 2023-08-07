package lab_reports.labone;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UI {

    private JFrame frame;
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private JTextArea textArea;

    public UI() {
        frame = new JFrame("UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.setMnemonic('O');
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        openMenuItem.addActionListener(e -> openFile());

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setMnemonic('S');
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke("control S"));
        saveMenuItem.addActionListener(e -> saveFile());

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke("control X"));
        exitMenuItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        toolBar = new JToolBar();
        toolBar.add(new JButton(new AbstractAction("Open") {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        }));
        toolBar.add(new JButton(new AbstractAction("Save") {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        }));

        textArea = new JTextArea();

        frame.setJMenuBar(menuBar);
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(textArea, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                textArea.setText(Files.readString(file.toPath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int result = fileChooser.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                Files.writeString(file.toPath(), textArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI();
            }
        });
    }
}