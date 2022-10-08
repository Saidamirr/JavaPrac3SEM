package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class TestShape extends Canvas {
    public void paint(Graphics graphics) {
        for(int i = 0; i < 20; i++) {
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int height = 100 + (int) (Math.random() * 40);
            int width = 100 + (int) (Math.random() * 40);
            int x = (int) (Math.random() * 1000);
            int y = (int) (Math.random() * 1000);
            Color color = new Color(r, g, b);
            if(i % 2 == 0) {
                Rectangle rectangle = new Rectangle(width, height, x, y, color);
                rectangle.draw(graphics);
            } else {
                Oval oval = new Oval(width, height, x, y, color);
                oval.draw(graphics);
            }
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        TestShape g = new TestShape();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(g);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
