package ru.mirea.prac21.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        catalogToList("C:\\Users\\ytipy\\Desktop");
    }
    public static void catalogToList(String path){
        File file = new File(path);
        String[] array = null;
        if(file.exists() || file.isDirectory())
            array=file.list(null);
        else System.out.println("File not found");
        ArrayList<List> arrayList = new ArrayList<>(Collections.singleton(Arrays.asList(array)));
        for (int i = 0; i < arrayList.size() && i<5; i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
