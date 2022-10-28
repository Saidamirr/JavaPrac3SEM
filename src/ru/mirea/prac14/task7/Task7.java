package ru.mirea.prac14.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static boolean passwordIsCorrect(String str){
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.find();
    }

    public static void main(String[] args) {
        System.out.println(passwordIsCorrect("F032_Password"));
        System.out.println(passwordIsCorrect("TrySpy12"));
        System.out.println(passwordIsCorrect("smart_pass"));
        System.out.println(passwordIsCorrect("A007"));
    }
}
