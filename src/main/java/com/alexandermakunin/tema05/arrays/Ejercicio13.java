package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] V = new int[50];
        StringBuilder sb = new StringBuilder();
        Random aleatorio = new Random();
        for (int i = 0; i < V.length; i++){
            V[i] = aleatorio.nextInt(1,51);
        }
        System.out.println(Arrays.toString(V));
        int[] P = new int[V.length];
        if (V.length >= 50){
            for (int i = 0; i < V.length;i++,i++){
                    P[i] = V[i];
                    for (int j = 0; j < i; j++,j++) {
                        P[i] = P[i] + V[j];
                    }
            }
            sb.append(Arrays.toString(P).replaceAll(" 0"," Error"));
            System.out.println(sb);
        }
    }
}
