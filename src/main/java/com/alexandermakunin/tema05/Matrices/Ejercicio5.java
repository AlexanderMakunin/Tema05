package com.alexandermakunin.tema05.Matrices;

import java.util.Random;

public class Ejercicio5 {
    private static final int FILA = 8;
    private static final int COLUMNA = 8;
    private static casilla[][] mapa = new casilla[FILA][COLUMNA];

    private enum casilla {
        jugador,casillaVacia,T,X,N
    }

    private static void crearMapa (casilla[][] mapa){
        for (int i = 0; i < mapa.length;i++){
            for (int j = 0; j < mapa[i].length;i++){
                mapa[i][j] = casilla.casillaVacia;
            }
        }
    }

    private static void rellenarMapa (casilla[][] mapa){
        Random aleatorio = new Random();
        int[][] casillaJugador = new int[1][1];
        casillaJugador[0][1] = aleatorio.nextInt(0,9);
    }

    public static void main(String[] args) {

    }
}
