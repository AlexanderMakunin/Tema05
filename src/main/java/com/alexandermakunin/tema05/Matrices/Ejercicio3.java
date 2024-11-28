package com.alexandermakunin.tema05.Matrices;

import java.util.Scanner;

public class Ejercicio3 {
    public static void tableroToString (String tablero){

    }
    public static boolean esJugadaValida (Ficha[][] tablero, int fila, int columna){
        if (tablero[fila][columna] != null){
            return false;
        } else if (tablero[fila][columna] == null) {
            return true;
        }
        return true;
    }
    public static void play (Ficha[][] tablero, Jugador turnoActual) {
        Scanner leerJugada = new Scanner(System.in);
        boolean comprobar;
        String mesa = "";
        do {
            System.out.println("Donde quieres poner la ficha?");
            System.out.println("Indica fila");
            int fila = Integer.parseInt(leerJugada.nextLine());
            System.out.println("Indica columna");
            int columna = Integer.parseInt(leerJugada.nextLine());
            if (esJugadaValida(tablero, fila, columna)){
                comprobar = true;

            } else {
                comprobar = false;
            }
        } while (!comprobar);
        /*
        for (int[] fila : tablero){
            for ()
        }
        tableroToString();

         */


    }
    public static void reset () {
        Ficha[][] tablero = new Ficha[3][3];
        Jugador turnoActual = Jugador.PLAYER1;
    }
    public enum Ficha {
        O,X
    }
    public enum Jugador {
        PLAYER1,PLAYER2
    }
    public static void main(String[] args) {
        Ficha[][] tablero = new Ficha[3][3];
        Jugador turnoActual = Jugador.PLAYER1;
        reset();
        play(tablero,turnoActual);
    }
}
