package ru.mirea.lab5;

import java.awt.*;

public abstract class Shape {
    private Color color;
    private int xPos;
    private int yPos;

    public Color getColor() {
        return color;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public abstract void draw(Graphics g);
}
