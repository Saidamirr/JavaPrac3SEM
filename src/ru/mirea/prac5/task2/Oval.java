package ru.mirea.lab5;

import java.awt.*;

public class Oval extends Shape {
    private int width;
    private int height;
    public Oval(int width, int height) {
        this.height = height;
        this.width = width;
    }
    public Oval(int width, int height, int xPos, int yPos, Color color) {
        this.height = height;
        this.width = width;
        setxPos(xPos);
        setyPos(yPos);
        setColor(color);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(getxPos(), getyPos(),width,height);
    }
}
