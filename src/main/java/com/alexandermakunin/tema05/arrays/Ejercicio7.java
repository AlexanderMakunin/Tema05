package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio7 {
    public static void multiplo5(int [] array){
        for (int i = 0; array.length > i;i++){
            if (array[i] == 0){
                System.out.print("");
            } else if (array[i] % 5 == 0){
                System.out.println(array[i] + " es multiplo de 5");
            }
        }
    }
    public static void num0(int [] array){
        for (int i = 0; i < array.length;i++){
            if (array[i] == 0){
                System.out.println(array[i] + " es 0");
            }
        }
    }
    public static void multiplo10(int [] array){
        for (int i = 0; array.length > i;i++){
            if (array[i] == 0){
                System.out.print("");
            } else if (array[i] % 10 == 0){
                System.out.println(array[i] + " es multiplo de 10");
            }
        }
    }
    public static void main(String[] args) {
        int [] numAleatorios = new int[100];
        Random aleatorio = new Random();
        for (int i = 0; 99 > i; i++){
            numAleatorios[i] = aleatorio.nextInt(0,101);
        }
        multiplo5(numAleatorios);
        num0(numAleatorios);
        multiplo10(numAleatorios);
        }
    }
