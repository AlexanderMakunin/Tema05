package com.alexandermakunin.tema05.Matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 8;
        int [][] matriz = new int[FILAS][COLUMNAS];
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = aleatorio.nextInt(1,11);
            }
        }
        for (int[] fila : matriz){
            for ( int columna : fila){
                System.out.print(columna);
            }
        }
    }
}
