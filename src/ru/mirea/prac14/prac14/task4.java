package prac14;

import java.util.regex.Pattern;

public class task4 {
    public static boolean plusAfterNum(String str){
        String regex = "\\d+\\s*\\+";
        Pattern p = Pattern.compile(regex);
        return p.matcher(str).find();
    }

    public static void main(String[] args) {
        System.out.println(plusAfterNum("(1 + 8) – 9 / 4"));
        System.out.println(plusAfterNum("6 / 5 – 2 * 9 "));
    }
}
