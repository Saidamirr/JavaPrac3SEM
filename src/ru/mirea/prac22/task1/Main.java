package ru.mirea.prac22.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add((float)55);
        calc.add((float)104.6);
        calc.add((float)5);
        calc.add('-');
        calc.add('*');
        calc.add((float)10);
        calc.add('/');
        System.out.println(calc.check());
    }
}
