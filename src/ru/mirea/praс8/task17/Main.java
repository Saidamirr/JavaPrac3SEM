package ru.mirea.praс8.task17;

//TODO: Добавить остальные варианты. По условию у вас должно быть точно ОДИН варинт соотв. вашему списку

import java.util.Scanner;

public class Main {
    public static int findMax() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int max = 0;
        if(number > 0) {
            max = findMax();
        }
        return number > max ? number:max;
    }

    public static void main(String[] args) {
        System.out.println(findMax());
    }
}
