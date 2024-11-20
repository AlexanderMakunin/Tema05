package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        int sumaTotal = 0;
        int[] V = new int[50];
        Random aleatorio = new Random();
        for (int i = 0; i < V.length; i++){
            V[i] = aleatorio.nextInt(1,51);
        }
        System.out.println(Arrays.toString(V));
        int[] P = new int[V.length];
        if (V.length >= 50){
            for (int i = 0; i < V.length;i++){
                P[i] = V[i] + V[V[i]+1];
                System.out.println((P[i]));
                System.out.println((V[i]));
            }
        }
        System.out.println(Arrays.toString(P));
    }
}
