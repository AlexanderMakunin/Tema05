package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char character;
        char [] pares = new char [5];
        char [] impares = new char [5];
        int contadorPar = 0;
        int contadorImpar = 0;
        for (int i = 0; 10 > i;i++){
            System.out.println("introduzca un numero");
            character = leer.next().charAt(0);
            if (i % 2 == 0){
                impares[contadorImpar] = character;
                contadorImpar++;
            } else {
                pares[contadorPar] = character;
                contadorPar++;
            }
        }
        System.out.println("Impares: " + Arrays.toString(impares));
        System.out.println("Pares: " + Arrays.toString(pares));
    }
}
