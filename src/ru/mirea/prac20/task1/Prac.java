package ru.mirea.prac20.task1;

public class Prac {
    public static void main(String[] args) {
        Hell<Integer, String, String> hell = new Hell<>();
    }
}

class Hell<T,V,K>{
    private T id;
    private V key;
    private K hash;

}