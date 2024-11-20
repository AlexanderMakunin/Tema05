package com.alexandermakunin.tema05.arrays;

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] V = new int[50];
        Random aleatorio = new Random();
        for (int i = 0; i < V.length; i++){
            V[i] = aleatorio.nextInt(1,51);
        }
        int[] P = new int[V.length];
        if (V.length >= 50){
            for (int i = 0; i < V.length;i++){
                P[i] = V[i];
                for (int j = 0; j < i;j++){
                    P[i] = P[i] + V[j];
                }
            }
        }
    }
}
