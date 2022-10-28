package ru.mirea.prac14.task2;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340","abcdefghijklmnopqrstuv18340"));
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340","something else"));
    }
}