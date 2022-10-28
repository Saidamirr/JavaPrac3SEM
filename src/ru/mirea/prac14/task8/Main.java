package prac14.task8;

import java.util.Arrays;

public class Main{
    public static Object[] filter(Object[] array, Filter filter) {
        int shift = 0;
        for(int i = 0; i < array.length; i++){
            if (!filter.apply(array[i])) {
                shift++;
            }
            else {
                array[i - shift] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - shift);
    }

    public static void main(String[] args) {
        String array[] = new String[]{"error", "41234", "2453", "23424", "error"}; //РАНДОМНЫЙ МАССИВ
        String[] newArray = (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                String regex = "error"; //ТУТ УКАЖИТЕ ПАРАМЕТР ДЛЯ ФИЛЬТРА, В ДАННОМ СЛУЧАЕ ЭТО СТРОКА error
                return o != regex;
            }
        });
        System.out.print(String.join(", ", newArray));
    }
}