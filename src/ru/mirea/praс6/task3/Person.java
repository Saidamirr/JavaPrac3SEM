package ru.mirea.lab4;

public class Person implements Nameable{
    private String name;
    private String surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String getName() {
        return this.name+" "+this.surname;
    }
}
