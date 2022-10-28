package ru.mirea.prac16.task3;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Main {
    public static void main(String[] args) {

        String[] example = {"mail.ru", "Sanya", "admin"};

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View(example).setVisible(true);
            }
        });
    }
}
