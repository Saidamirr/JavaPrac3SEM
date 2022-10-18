package prac14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println("Введите разделитель:");
        String p = in.nextLine();
        Pattern p3 = Pattern.compile(p);
        String[] words = p3.split(str);
        for (String word : words)
            System.out.println(word);
    }
}