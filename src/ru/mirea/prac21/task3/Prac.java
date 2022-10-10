package ru.mirea.prac21.task3;

public class Prac {
    public static void main(String[] args) {
        Double[] doubles = new Double[]{12.0,43.0,765.43};
        Storage<Double> storage = new Storage<>();
        storage.setValues(doubles);
        System.out.println(storage);
        System.out.println(storage.getAtIndex(1));
    }
}

class Storage<E> {
    private E[] values;

    void setValues(E[] values) {
        this.values = values;
    }

    E getAtIndex(int index){
        return values[index];
    }

    int getLength(){
        return values.length;
    }

    @Override
    public String toString() {
        String value="";
        for (Object element:this.values) {
            value+=element.toString()+" ";
        }
        return "Storage="+value;
    }
}
