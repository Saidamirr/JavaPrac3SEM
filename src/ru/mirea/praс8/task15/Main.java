package ru.mirea.praс8.task15;

public class Main {
    public static void rightToLeft(int input) {
        System.out.print(input%10 + " ");
        if(input > 10) {
            rightToLeft(input / 10);
        }
    }

    public static void main(String[] args) {
        rightToLeft(1283);
    }
}
