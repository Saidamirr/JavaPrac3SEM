package ru.mirea.prac20.task3;

import java.io.Serializable;

public class Prac {
    public static void main(String[] args) {
        Hell<Integer, Dog, String> hell = new Hell(123, new Dog(), "lol");
        hell.printTypesNames();
    }
}

class Animal {}
class Dog extends Animal implements Serializable {}

class Hell<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T id;
    private V key;
    private K hash;
    Hell(T id, V key, K hash) {
        this.id = id;
        this.key = key;
        this.hash = hash;
    }
    public T getId() {
        return id;
    }
    public V getKey() {return key;}
    public K getHash() {
        return hash;
    }
    public void printTypesNames() {
        System.out.println(getId().getClass().getTypeName() + " " + getKey().getClass().getSimpleName() + " " + getHash().getClass().getTypeName());
    }
}

