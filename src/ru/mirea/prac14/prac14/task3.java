package prac14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String regex = "\\d+(\\.\\d+)?\\s?((USD)|(RUB)|(EUR))";
        String str = "This phone costs 50 USD, 45 EUR or 1 RUB"; // РАНДОМНАЯ СТРОКА, ВПИШИТЕ СВОЮ!!!

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
