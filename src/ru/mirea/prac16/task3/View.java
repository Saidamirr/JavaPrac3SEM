package ru.mirea.prac16.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

public class View extends JFrame {
    public void checkInput(String[] example, String[] inputs) {
        for(int i = 0; i < 3; i++) {
            if (!example[i].equals(inputs[i])) {
                JOptionPane.showMessageDialog(null, "The inputs are incorrect!", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                dispose();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "The inputs are correct!", "True",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    public View(String[] example) {

        String[] labels = {"Service: ", "User name: ", "Password: "};
        String[] inputs = new String[3];

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        JTextField[] fields = new JTextField[labels.length];

        for(int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel(labels[i]);
            panel.add(label);
            fields[i] = new JTextField(15);
            label.setLabelFor(fields[i]);
            panel.add(fields[i]);

            layout.putConstraint(SpringLayout.WEST, fields[i], 80, SpringLayout.WEST, panel);
            layout.putConstraint(SpringLayout.NORTH, fields[i], 25 * i + 10, SpringLayout.WEST, panel);

            layout.putConstraint(SpringLayout.EAST, panel, 10, SpringLayout.EAST, fields[i]);

            layout.putConstraint(SpringLayout.EAST, label, -5, SpringLayout.WEST, fields[i]);
            layout.putConstraint(SpringLayout.NORTH, label, 25 * i + 10, SpringLayout.WEST, panel);
        }
        for(int i = 0; i < fields.length; i++) {
            fields[i].addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                        for(int j = 0; j < fields.length; j++)
                            inputs[j] = fields[j].getText();
                        checkInput(example, inputs);
                    }

                }

                @Override
                public void keyReleased(KeyEvent e) {}
            });
        }

        setTitle("Password application");
        setContentPane(panel);
        setSize(260,150);
    }
}
