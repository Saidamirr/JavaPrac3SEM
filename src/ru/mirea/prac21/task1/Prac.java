package ru.mirea.prac21.task1;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        Integer[] array = {12,43,12,54,76,32};
        Double[] array2 = {12.7,4.0,12.8,54.21,76.65432,32.87654323456765432};
        String[] array3 = {"234232","asfsfsdgdfg","sdwetyryjhtgerwfe"," sdasdsdasd"};
        List list = new ArraysToLists<>().arrayToList(array);
        List list2 = new ArraysToLists<>().arrayToList(array2);
        List list3 = new ArraysToLists<>().arrayToList(array3);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
    }
}

class ArraysToLists<E> {
    List arrayToList(E[] e) {
        List list = new ArrayList();
        for (E element : e) {
            list.add(element);
        }
        return list;
    }
}