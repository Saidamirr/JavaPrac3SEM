package ru.mirea.praс6.task4;

public class CheeseSticks implements Priceable{
    private int price;

    public CheeseSticks(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
