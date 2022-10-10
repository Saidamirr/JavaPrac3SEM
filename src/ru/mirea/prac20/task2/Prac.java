package ru.mirea.prac20.task2;

public class Prac {
    public static void main(String[] args) {
       Hell<Integer, String, String> hell = new Hell<>(123,"lol","lol");
       hell.printTypesNames();
    }
}

class Hell <T extends Comparable,V,K>{

    private T id;
    private V key;
    private K hash;

    Hell(T id,V key,K hash){
        this.id = id;
        this.key = key;
        this.hash = hash;
    }

    public T getId() {
        return id;
    }

    public V getKey() {
        return key;
    }

    public K getHash() {
        return hash;
    }

    public void printTypesNames(){
        System.out.println(getId().getClass().getTypeName()+" "+getKey().getClass().getTypeName()+" "+getHash().getClass().getTypeName());
    }
}