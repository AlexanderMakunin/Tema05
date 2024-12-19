package com.alexandermakunin.tema05.Matrices;

import com.alexandermakunin.lib.ANSI;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

import javax.swing.*;
import java.util.Random;

public class Ejercicio5 implements NativeKeyListener {
    public enum Celda {
        VACIA(Config.SPRITE_VACIA),
        NPC(Config.SPRITE_NPC),
        OBSTACULO(Config.SPRITE_OBSTACULO),
        TESORO(Config.SPRITE_TESORO),
        JUGADOR(Config.SPRITE_JUGADOR),
        EXCAVADA(Config.SPRITE_EXCAVADA),
        HABILIDAD(Config.SPRITE_HABILIDAD);

        private final String sprite;
        Celda(String sprite) {
            this.sprite = sprite;
        }

        @Override
        public String toString() {
            return sprite;
        }
    }

    public enum Movimiento {
        UP, DOWN, LEFT, RIGHT, NONE, DIG
    }

    private static Random random;
    private static Celda[][] mapa;
    private static Posicion[] posicionesLibres;
    private static Posicion posicionJugador;
    private static Celda celdaDestino;
    private static int cantidadPosicionesLibres;
    private static int usosRestantes;


    public static void main(String[] args) {
        mapa = new Celda[Config.FILAS][Config.COLUMNAS];
        random = new Random();
        cantidadPosicionesLibres = 0;
        posicionesLibres = new Posicion[Config.FILAS * Config.COLUMNAS];

        try {
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new Ejercicio5());
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }

        reset();

        System.out.println(mapaToString(mapa));
    }

    public static void reset() {
        generarMapa();
        usosRestantes = 3;
    }



    public static void generarMapa() {
        // Reiniciar posiciones libres
        cantidadPosicionesLibres = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = Celda.VACIA;
                posicionesLibres[cantidadPosicionesLibres++] = new Posicion(i, j);
            }
        }

        // Generamos obstáculos
        for (int i = 0; i < Config.CANTIDAD_OBSTACULOS; i++) {
            generarCeldaAleatoria(Celda.OBSTACULO);
        }

        // Generamos NPC
        for (int i = 0; i < Config.CANTIDAD_NPC; i++) {
            generarCeldaAleatoria(Celda.NPC);
        }

        // Generamos HABILIDADES
        for (int i = 0; i < Config.CANTIDAD_HABILIDADES; i++) {
            generarCeldaAleatoria(Celda.HABILIDAD);
        }

        generarCeldaAleatoria(Celda.TESORO);

        posicionJugador = generarCeldaAleatoria(Celda.JUGADOR);

    }

    public static Posicion generarCeldaAleatoria(Celda celda) {
        // Si no hay posiciones libres, salimos
        if (cantidadPosicionesLibres == 0) {
            return null;
        }
        // Generamos un índice aleatorio
        int indiceAleatorio = random.nextInt(cantidadPosicionesLibres);
        // Obtenemos la posición que hay en ese índice
        Posicion posicion = posicionesLibres[indiceAleatorio];
        // Decrementamos la cantidad de posiciones libres
        cantidadPosicionesLibres--;
        // Ubicamos el último elemento en la posición que acabamos de extraer
        posicionesLibres[indiceAleatorio] = posicionesLibres[cantidadPosicionesLibres];
        // Finalmente, ponemos la celda que hemos recibido como parámetro en la posición indicada
        mapa[posicion.fila][posicion.columna] = celda;
        return posicion;
    }


    public static String mapaToString(Celda[][] mapa) {
        StringBuilder sb = new StringBuilder();
        sb.append(Celda.OBSTACULO.sprite.repeat(mapa[0].length + 2)).append("\n");
        for (Celda[] fila : mapa) {
            sb.append(Celda.OBSTACULO);
            for (Celda celda : fila) {
                sb.append(celda);
            }
            sb.append(Celda.OBSTACULO).append("\n");
        }
        sb.append(Celda.OBSTACULO.sprite.repeat(mapa[0].length + 2)).append("\n");
        return sb.toString();
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        char tecla = e.getKeyChar();
        System.out.println("\n");
        Movimiento movimiento = switch (tecla) {
            case Config.UP -> Movimiento.UP;
            case Config.DOWN -> Movimiento.DOWN;
            case Config.LEFT -> Movimiento.LEFT;
            case Config.RIGHT -> Movimiento.RIGHT;
            case Config.DIG -> Movimiento.DIG;
            default -> Movimiento.NONE;
        };
        if (!movimiento.equals(Movimiento.NONE)) {
            mover(movimiento);
            ANSI.clearScreen();
            System.out.println(mapaToString(mapa));
            System.out.println("Key Typed: " + e.getKeyChar());
        }
    }

    public static void dig() {
        if (!mapa[posicionJugador.fila][posicionJugador.columna].equals(Celda.EXCAVADA)) {
            mapa[posicionJugador.fila][posicionJugador.columna] = Celda.EXCAVADA;
        }
    }

    public static void DIG(Movimiento movimiento) {
        if (movimiento.equals(Movimiento.DIG)){
            dig();
            return;
        }
    }

    public static void mover(Movimiento movimiento) {
        Posicion movimientoDestino = new Posicion(posicionJugador.fila, posicionJugador.columna);

        Celda destino = mapa[posicionJugador.fila][posicionJugador.columna];
        switch (movimiento){
            case UP -> {
                if (posicionJugador.fila > 0) {
                    destino = mapa[posicionJugador.fila - 1][posicionJugador.columna];
                    movimientoDestino.fila -= 1;
                }
            }
            case DOWN -> {
                if (posicionJugador.fila < mapa.length - 1) {
                    destino = mapa[posicionJugador.fila + 1][posicionJugador.columna];
                    movimientoDestino.fila += 1;
                }
            }
            case LEFT -> {
                if (posicionJugador.columna > 0) {
                    destino = mapa[posicionJugador.fila][posicionJugador.columna - 1];
                    movimientoDestino.columna -= 1;
                }
            }
            case RIGHT -> {
                if (posicionJugador.columna < mapa[0].length - 1) {
                    destino = mapa[posicionJugador.fila][posicionJugador.columna + 1];
                    movimientoDestino.columna += 1;
                }
            }

        }
        switch (destino) {
            case OBSTACULO -> {
                return;
            }
            case NPC -> interaccionNPC();
            default -> {
                mapa[posicionJugador.fila][posicionJugador.columna] = celdaDestino;
                //guardamos la celda destino
                celdaDestino = mapa[movimientoDestino.fila][movimientoDestino.columna];
                if (destino.equals(Celda.HABILIDAD)){
                    celdaDestino = Celda.VACIA;
                } else {
                    celdaDestino = mapa[movimientoDestino.fila][movimientoDestino.columna];
                }
                mapa[movimientoDestino.fila][movimientoDestino.columna] = Celda.JUGADOR;
                posicionJugador.fila = movimientoDestino.fila;
                posicionJugador.columna = movimientoDestino.columna;
            }
        }
    }

    public static void interaccionNPC() {

    }

    public static void interacionHabilidad() {

    }

    public static class Posicion {
        private int fila;
        private int columna;

        public Posicion(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }
    }
}
