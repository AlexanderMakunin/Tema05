package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] num = new int[4];
        String stringArray;
        String guardarNumeros = "";
        int contador = 0;
        for (int i = 0;20 > i;i++){
            System.out.println("introduzca un numero");
            num[contador] = Integer.parseInt(leer.next());
            stringArray = Arrays.toString(num);
            if (contador == 3){
                contador = 0;
                guardarNumeros = guardarNumeros + "\n" + stringArray;
            } else {
                contador++;
            }
        }
        System.out.println(guardarNumeros);
    }
}