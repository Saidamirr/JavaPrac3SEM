package prac14;

public class task9 {
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
        FrequencyDictionary("Какой-то текст для проверки работы метода"); //рандомный текст
    }
}
