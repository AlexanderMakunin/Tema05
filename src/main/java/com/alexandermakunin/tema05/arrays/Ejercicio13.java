package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] v = new int[50];
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Random aleatorio = new Random();
        for (int i = 0; i < v.length; i++){
            v[i] = aleatorio.nextInt(1,51);
        }
        int[] p = new int[v.length];
        System.out.println(Arrays.toString(v));
        if (v.length >= 50){
            for (int i = 0; i < v.length;i++){
                System.out.println(v[i]);
                p[i] = v[i];
                if (p[i] % 2 == 0){
                    sb.append(p[i]);
                    sb.append(", ");
                }
            }
            sb.append("]");
            String texto = sb.toString();
            texto = texto.replace(", ]","]");
            System.out.println(texto);
        }
    }
}
