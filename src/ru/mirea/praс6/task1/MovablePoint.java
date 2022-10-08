package ru.mirea.praс6.task1;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override
    public String toString() {
        return " x: "+this.x+" y: "+this.y+" X Speed: "+this.xSpeed+" Y Speed: "+this.ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += 1;
    }

    @Override
    public void moveDown() {
        this.y -= 1;
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
    }

    @Override
    public void moveRight() {
        this.x += 1;
    }
}
