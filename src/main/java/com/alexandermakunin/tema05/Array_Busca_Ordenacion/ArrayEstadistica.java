package com.alexandermakunin.tema05.Array_Busca_Ordenacion;

public class ArrayEstadistica {
    private final int[] array;
    private int min;
    private int max;

    public ArrayEstadistica(int[] array){
        this.array = array;
        min = array[0];
        max = array[0];
        for (int i = 0; i < array.length;i++){
            if (min > array[i]){
                min = array[i];
            } else if (max < array[i]) {
                max = array[i];
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    public  int getMax() {
        return max;
    }
    public int getMin () {
        return min;
    }
}
