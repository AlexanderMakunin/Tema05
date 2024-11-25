package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] v = new int[50];
        int contador = 0;
        Random aleatorio = new Random();
        for (int i = 0; i < v.length; i++){
            v[i] = aleatorio.nextInt(1,51);
        }
        if (v.length >= 50){
            for (int numero : v) {
                if (numero % 2 == 0) {
                    contador++;
                }
            }
            int[] p = new int[contador];
            contador = 0;
            for (int numero : v) {
                if (numero % 2 == 0) {
                    p[contador] = numero;
                    contador++;
                }
            }
            if (p[contador-1] == 0) {
                System.out.println("No se ha encontrado nada");
            } else {
                System.out.println(Arrays.toString(p));
            }
        }
    }
}
