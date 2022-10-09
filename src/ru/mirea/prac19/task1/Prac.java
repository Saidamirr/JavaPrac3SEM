package ru.mirea.prac19.task1;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Prac {
    static Person person = new Person("Грабер", "Владислав", "Игоревич", 7713456568L);

    public static void main(String[] args) throws NotValidInnException {
        long Inn;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию:");
        String surName = scanner.next();
        System.out.print("Введите имя:");
        String firstName = scanner.next();
        System.out.print("Введите отчество:");
        String middleName = scanner.next();
        System.out.print("Введите ИНН:");
        try {
            Inn = scanner.nextLong();
        } catch (InputMismatchException e){
            throw new NotValidInnException("Not valid Inn, use nothing but digits");
        }
        Person person1 = new Person(surName, firstName, middleName, Inn);
        if (person.equals(person1)) {
            System.out.println("Authentication completed");
        } else {
            throw new NotValidInnException("Not valid Inn:"+person1.getINN());
        }
    }
}

class Person {
    private final String surName;
    private final String firstName;
    private final String middleName;
    private final long INN;

    public Person(String surName, String firstName, String middleName, long INN) {
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.INN = INN;
    }
    public long getINN() {
        return INN;
    }
    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return Objects.equals(INN, person.INN) && Objects.equals(surName, person.surName) && Objects.equals(firstName, person.firstName) && Objects.equals(middleName, person.middleName);
    }

}

class NotValidInnException extends Exception {
    public NotValidInnException(String errorMessage) {
        super(errorMessage);
    }
}