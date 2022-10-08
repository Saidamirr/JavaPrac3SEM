package ru.mirea.lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main extends JFrame {
    public Main() {
        JTextArea area = new JTextArea();
        Button button = new Button("Enter text in file");
        Font font = new Font("Times new roman", Font.PLAIN, 20);
        area.setFont(font);
        button.setFont(font);
        JFrame frame = new JFrame("Input window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(area);
        frame.add(button, BorderLayout.SOUTH);
        frame.setSize(500, 500);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(FileWriter writer = new FileWriter("output.txt")) {
                    writer.write(area.getText());
                } catch (IOException eio) {
                    JOptionPane.showMessageDialog(null, eio.getMessage(),
		    "alert", JOptionPane.ERROR_MESSAGE);
                }
                area.setText("");
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
