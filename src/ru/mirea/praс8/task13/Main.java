package ru.mirea.praс8.task13;

import java.util.Scanner;

public class Main {
    public static void printNumbers() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Вывод: " + number);
        number = input.nextInt();
        if(number != 0) {
            printNumbers();
        }
    }
    public static void main(String[] args) {
         printNumbers();
    }
}
