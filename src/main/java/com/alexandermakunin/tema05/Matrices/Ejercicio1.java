package com.alexandermakunin.tema05.Matrices;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca las filas");
        int filas = Integer.parseInt(leer.nextLine());
        System.out.println("Introduzca las columnas");
        int columnas = Integer.parseInt(leer.nextLine());
        float [][] arrays = new float[filas][columnas];
        float num;
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays[i].length;j++){
                System.out.println("Introduzca el numero de la fila " + i + " en la columna " + j);
                num = Float.parseFloat(leer.nextLine());
                arrays[i][j] = num;
            }
        }
        for (float[] fila : arrays){
            for ( float columna : fila){
                System.out.printf("%.4f ",columna);
            }
            System.out.println();
        }
    }
}
