package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private JTextArea allWords;
    private JButton buttonFindLongestWords;
    private JButton loadFromFile;
    private JTextArea longestWords;
    private JPanel panelMain;

    public Window() {
        this.setTitle("FrameMain");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        buttonFindLongestWords.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonFindLongestWords.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String[] inputString = allWords.getText().split(" ");
                    longestWords.setText(Main.process(inputString).toString());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка");
                }
            }
        });
    }
}
