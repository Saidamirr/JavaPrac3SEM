package ru.mirea.prac20.task4;

public class Prac {
    public static void main(String[] args) {
        Human lol = new Human(69);
        Human lel = new Human(96);
        Human lal = new Human(126);
        Human[] luls = {lol, lel, lal};
        MinMax<Human> minMax = new MinMax<>(luls);
        System.out.println(minMax.findMax().toString());
        System.out.println(minMax.findMin().toString());
        System.out.println(Calculator.sum(12L, -4));
    }
}

class Human implements Comparable<Human> {
    private int age = 0;

    public Human(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Human o) {
        if (o.age > this.age) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}

class MinMax<E extends Comparable<E>> {
    private final E[] array;

    MinMax(E[] array) {
        this.array = array;
    }

    E findMin() {
        E element = array[0];
        for (E e : array) {
            if (element.compareTo(e) < 0)
                element = e;
        }
        return element;
    }

    E findMax() {
        E element = array[0];
        for (E e : array) {
            if (element.compareTo(e) > 0)
                element = e;
        }
        return element;
    }
}

class Calculator{
    static <S extends Number,U extends Number> double sum(S num1,U num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    static <S extends Number,U extends Number> double subtraction(S num1,U num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    static <S extends Number,U extends Number> double multiply(S num1,U num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    static <S extends Number,U extends Number> double divide(S num1,U num2){
        return num1.doubleValue() / num2.doubleValue();
    }
}