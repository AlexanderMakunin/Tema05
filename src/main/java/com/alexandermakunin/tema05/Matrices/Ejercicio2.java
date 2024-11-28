package com.alexandermakunin.tema05.Matrices;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int FILAS = 50;
        final int COLUMNAS = 20;
        int[] V = new int[FILAS];
        int[] P = new int[COLUMNAS];
        Random aleatorio = new Random();
        for (int i = 0; i < V.length;i++){
            V[i] = aleatorio.nextInt(1,11);
        }
        for (int i = 0; i < P.length;i++){
            P[i] = aleatorio.nextInt(1,11);
        }
        int[][] M = new int[V.length][P.length];
        for (int i = 0; i < M.length;i++){
            for (int j = 0; j < M[i].length;j++){
                M[i][j] = V[i] * P[j];
            }
        }
    }
}
