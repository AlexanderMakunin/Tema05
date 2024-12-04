package com.alexandermakunin.tema05.Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    private static int getFilaReal(char fila) {
        return fila - 'A';
    }
    private static int getColumnaReal(char columna) {
        return columna - '1';
    }
    private static Ficha getFichaJugador(Jugador jugador){
        Ficha[] fichas = Ficha.values();
        return fichas[jugador.ordinal()];
    }
    /**
     * Pasar el tablero
     * @param tablero
     */
    public static String tableroToString (Ficha[][] tablero){
        StringBuilder sb = new StringBuilder();
        //sb.append(String.format("%4s", ));
        for (int i = 0; i < tablero.length;i++){
            sb.append("|---|---|---|\n");
            for (int j = 0; j < tablero[i].length;j++){
                sb.append("| ").append(tablero[i][i]);
            }
        }
        sb.append("|---|---|---|\n");
        return sb.toString();

    }
    public static boolean esJugadaValida (char fila, int columna){
        int filaReal = fila - 'A';
        int columnaReal = columna - 1;
        return tablero[filaReal][columnaReal] != null;
    }
    public static void play (Ficha[][] tablero, Jugador turnoActual) {
        char fila = ' ';
        char columna = ' ';
        leer = new Scanner(System.in);
        boolean valido;
        System.out.println("Turno del jugador: " + turnoActual);
        do {
            System.out.println("Jugada?");
            String posicion = leer.nextLine().toLowerCase();
            valido = posicion.length() == 2;
            if (!valido) {
                System.err.println("La longitud del texto debe ser de 2 caracteres.");
                continue;
            }
            fila = posicion.charAt(0);
            columna = posicion.charAt(1);
            valido = (fila >= 'A' && fila <= 'C') &&
                    (columna >= '1' && columna <= '3');
            if (!valido) {
                System.err.println("Debe indicar la fila (letra) y la columna (número), Ej: A2");
                continue;
            }
            valido = esJugadaValida(fila, Character.getNumericValue(columna));
            if (!valido) {
                System.err.println("Esa posicion ya esta ocupada");
            }
        }while (!valido);
        tablero[getFilaReal(fila)][getColumnaReal(columna)] = getFichaJugador(turnoActual);
    }
    public static void reset () {
        Random turnoJugador = new Random();
        for (int i = 0; i < tablero.length;i++){
            for (int j = 0; j < tablero[i].length;j++){
                tablero[i][j] = null;
            }
        }
        Jugador[] valoresJugador = Jugador.values();
        turnoActual = valoresJugador[turnoJugador.nextInt(0,valoresJugador.length)];
    }

    public enum Ficha {
        O, X
    }

    public enum Jugador {
        PLAYER1, PLAYER2
    }

    public static final int FILAS = 3;
    public static final int COLUMNAS = 3;
    private static Jugador turnoActual;
    private static Ficha[][] tablero;
    private static Scanner leer;

    public static void main(String[] args) {
        tablero = new Ficha[FILAS][COLUMNAS];
        reset();
        play(tablero,turnoActual);
        play(tablero,turnoActual);
    }

}
