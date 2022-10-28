package ru.mirea.prac14.task9;

public class Task9 {
    public static void FrequencyDictionary(String text) {
        text = text.toLowerCase();
        int[] dict = new int['я' - 'а' + 1];
        for(int i = 0; i < text.length(); i++) {
            char sym = text.charAt(i);
            if(sym >= 'а' && sym <= 'я'){
                dict[sym - 'а']++;
            }
        }
        for(int i = 0; i < dict.length; i++) {
            System.out.println((char) (i + 'а') + " - " + dict[i]);
        }
    }

    public static void main(String[] args) {
        FrequencyDictionary("А я сегодня позвонил в техподдержку, сказал, \"подождите пожалуйста, абонент сейчас" +
                " подойдет\" и начал импровизировать на гитаре");
    }
}
