package prac14;

import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340","abcdefghijklmnopqrstuv18340"));
        System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340","something else"));
    }
}