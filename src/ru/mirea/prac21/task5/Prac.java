package ru.mirea.prac21.task5;

import java.util.*;

class Prac{
    public static void main(String[] args) {

    }
}
class Solution <T,V,K>{
    private final T type;
    private final V values;
    private final K keys;
    public static void main(String[] args) {

    }

    public Solution(T type, V values, K keys) {
        this.type = type;
        this.values = values;
        this.keys = keys;
    }

    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... t){
        return new ArrayList<>(Arrays.asList(t));
    }
    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... t){
        return new HashSet<>(Arrays.asList(t));
    }

    public static <K,V> HashMap<K,V> newHashSet(List<? extends K> keys,List<? extends V> values){
        HashMap<K,V> result = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            result.put(keys.get(i),values.get(i) );
        }
        return result;

    }
}
