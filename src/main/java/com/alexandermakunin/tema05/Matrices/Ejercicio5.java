package com.alexandermakunin.tema05.Matrices;

import java.util.Random;

public class Ejercicio5 {
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

    private static Random random;
    private static Celda[][] mapa;
    private static Posicion[] posicionesLibres;
    private static int cantidadPosicionesLibres;


    public static void main(String[] args) {
        mapa = new Celda[Config.FILAS][Config.COLUMNAS];
        random = new Random();
        cantidadPosicionesLibres = 0;
        posicionesLibres = new Posicion[Config.FILAS * Config.COLUMNAS];

        reset();

        System.out.println(mapaToString(mapa));
    }

    public static void reset() {
        generarMapa();
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

        for (int i = 0; i < Config.CANTIDAD_NPC;i++){
            generarCeldaAleatoria(Celda.NPC);
        }

        for (int i = 0; i < Config.CANTIDAD_OBSTACULOS;i++){
            generarCeldaAleatoria(Celda.OBSTACULO);
        }

        for (int i = 0; i < Config.CANTIDAD_HABILIDADES;i++){
            generarCeldaAleatoria(Celda.HABILIDAD);
        }
        generarCeldaAleatoria(Celda.TESORO);
        generarCeldaAleatoria(Celda.JUGADOR);

    }

    public static void generarCeldaAleatoria(Celda celda) {
        // Si no hay posiciones libres, salimos
        if (cantidadPosicionesLibres == 0) {
            return;
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
    }


    public static String mapaToString(Celda[][] mapa) {
        StringBuilder sb = new StringBuilder();
        sb.append(Celda.OBSTACULO.sprite.repeat(mapa[0].length+2)).append("\n");
        for (Celda[] fila : mapa) {
            sb.append(Celda.OBSTACULO.sprite);
            for (Celda celda : fila) {
                sb.append(celda);
            }
            sb.append(Celda.OBSTACULO.sprite);
            sb.append("\n");
        }
        sb.append(Celda.OBSTACULO.sprite.repeat(mapa[0].length+2));
        return sb.toString();
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
