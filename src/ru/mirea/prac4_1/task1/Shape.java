package ru.mirea.prac4_1.task1;

public abstract class Shape {
    public abstract String getType();
    public abstract String getArea();
    public abstract String getPerimeter();

    @Override
    public String toString() {
        return getType() + "\n" + getArea()
                + "\n" + getPerimeter();
    }
}
