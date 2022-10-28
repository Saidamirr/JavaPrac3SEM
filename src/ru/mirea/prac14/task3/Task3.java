package ru.mirea.prac14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String regex = "\\d+(\\.\\d+)?\\s?((USD)|(RUB)|(EUR))";
        String str = "This phone costs 100 USD, 90 EUR or 45000 RUB";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
