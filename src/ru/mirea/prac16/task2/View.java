package ru.mirea.prac16.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.*;

public class View extends JFrame {
    private Color color;
    private Font font;
    private void createMenuBar(JTextArea textArea) {
        JMenuBar menuBar = new JMenuBar();
        JMenu textMenu = new JMenu("Текст");

        JMenuItem fontTNR = new JMenuItem("Times New Roman");
        fontTNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                font = new Font("Times New Roman", Font.PLAIN, 20);
                textArea.setFont(font);
            }
        });
        JMenuItem fontMSSansSerif = new JMenuItem("MS Sans Serif");
        fontMSSansSerif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                font = new Font("MS Sans Serif", Font.PLAIN, 20);
                textArea.setFont(font);
            }
        });
        JMenuItem fontCourierNew = new JMenuItem("Courier New");
        fontCourierNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                font = new Font("Courier New", Font.PLAIN, 20);
                textArea.setFont(font);
            }
        });
        JMenuItem fontItems = new JMenu("Шрифт");
        fontItems.add(fontTNR);
        fontItems.add(fontMSSansSerif);
        fontItems.add(fontCourierNew);
        textMenu.add(fontItems);

        JMenuItem colorBlue = new JMenuItem("Синий");
        colorBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = BLUE;
                textArea.setForeground(color);
            }
        });
        JMenuItem colorRed = new JMenuItem("Красный");
        colorRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = RED;
                textArea.setForeground(color);
            }
        });
        JMenuItem colorBlack = new JMenuItem("Чёрный");
        colorBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = BLACK;
                textArea.setForeground(color);
            }
        });
        JMenuItem colorItems = new JMenu("Цвет");
        colorItems.add(colorRed);
        colorItems.add(colorBlue);
        colorItems.add(colorBlack);
        textMenu.add(colorItems);

        menuBar.add(textMenu);

        setJMenuBar(menuBar);
    }
    public View() {
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textArea.setForeground(BLACK);
        createMenuBar(textArea);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        add(textArea, BorderLayout.CENTER);
    }
}
