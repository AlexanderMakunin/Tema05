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
        System.out.println("Donde quieres poner la ficha?");
        System.out.println("Indica fila");
        int fila = Integer.parseInt(leerJugada.nextLine());
        System.out.println("Indica columna");
        int columna = Integer.parseInt(leerJugada.nextLine());
        if (esJugadaValida(tablero, fila, columna)){

        }


    }
    public static void reset (Ficha[][] tablero, Jugador turnoActual) {
        tablero = new Ficha[3][3];
        turnoActual = Jugador.PLAYER1;
    }
    enum Ficha {
        O,X
    }
    enum Jugador {
        PLAYER1,PLAYER2
    }
    public static void main(String[] args) {
        Ficha[][] tablero = new Ficha[3][3];
        Jugador turnoActual = Jugador.PLAYER1;
        reset(tablero,turnoActual);
        play(tablero,turnoActual);
    }
}
