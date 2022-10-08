package ru.mirea.praс6.task1;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "x: "+this.x+" y: "+this.y+" xSpeed: "+this.xSpeed+" ySpeed: "+this.ySpeed+" radius: "+this.radius;
    }
}

