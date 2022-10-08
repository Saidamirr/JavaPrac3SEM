package ru.mirea.lab4;

public class Worker extends Person{
    private String place;
    public Worker(String name, String surname, String place) {
        super(name, surname);
        this.place = place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
