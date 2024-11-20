package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] P = new int[10];
        for (int i = 0; i < P.length;i++){
            System.out.println("Introduzca 10 numeros");
            P[i] = Integer.parseInt(leer.nextLine());
        }
        System.out.println(Arrays.toString(P));
        int[] S = new int[10];
        for (int i = 0; i < S.length;i++){
            if (P[i] <= 10){
                S[i] = -1;
            } else {
                S[i] = P[i];
            }
        }
        System.out.println(Arrays.toString(S));
    }
}
