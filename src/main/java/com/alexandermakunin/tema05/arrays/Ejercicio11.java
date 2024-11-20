package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int contador = 0;
        int[] V = {-1,30,20,1,5,100,-5,7,-100,1000};
        System.out.println(Arrays.toString(V));
        int[] P = new int[V.length];
        if (V.length >= 10){
            for (int i = P.length-1; i >= 0;i--){
                P[contador] = V[i];
                contador++;
            }
        }
        System.out.println(Arrays.toString(P));
    }
}
