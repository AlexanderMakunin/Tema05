package com.alexandermakunin.tema05.Array_Busca_Ordenacion;

import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
        int[] array = {1,30,20,1,5,100,5,7,100,1000};
        int guardar = array[0];
        int cambio = 0;
        for (int i = 0; i < array.length-1;i++){
            if (guardar < array[i]){
                cambio = array[i];
                array[i] = guardar;
                guardar = cambio;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
