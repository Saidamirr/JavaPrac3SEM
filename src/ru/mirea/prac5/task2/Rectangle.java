package ru.mirea.lab5;

import java.awt.*;

public class Rectangle extends Shape {
    int width;
    int height;
    public Rectangle(int width, int height, int xPos, int yPos, Color color) {
        this.width = width;
        this.height = height;
        this.setxPos(xPos);
        this.setyPos(yPos);
        this.setColor(color);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(getxPos(), getyPos(), height, width);
    }
}
