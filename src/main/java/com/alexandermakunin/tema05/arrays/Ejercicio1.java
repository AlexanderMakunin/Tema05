package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] num = new int[10];
        int sumador = 0;
        for (int i = 0;num.length > i;i++){
            System.out.println("introduzca un numero");
            num[i] = Integer.parseInt(leer.next());
            sumador = sumador + num[i];
        }
        sumador = sumador / 10;
        System.out.println(Arrays.toString(num));
        System.out.println("la media es: " + sumador);
    }
}
