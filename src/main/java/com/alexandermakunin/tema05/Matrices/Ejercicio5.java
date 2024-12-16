package com.alexandermakunin.tema05.Matrices;

import java.util.Random;

public class Ejercicio5 {
    private static Celda[][] mapa;
    private static Random aleatorio;

    private enum Celda {
        VACIA(Config.SPRITE_VACIO),
        NPC(Config.SPRITE_NPC),
        OBSTACULO(Config.SPRITE_OBSTACULO),
        TESORO(Config.SPRITE_TESORO),
        JUGADOR(Config.SPRITE_JUGADOR),
        EXCAVADO(Config.SPRITE_EXCAVADO),
        HABILIDAD(Config.SPRITE_HABILIDAD);

        private String sprite;
        Celda (String sprite) {
            this.sprite = sprite;
        }

        @Override
        public String toString() {
            return sprite;
        }
    }

    public static String mapaToString(Celda[][] mapa){
        StringBuilder sb = new StringBuilder();
        for (Celda[] fila : mapa){
            for (Celda celda : fila){
                sb.append(celda);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        mapa = new Celda[Config.FILAS][Config.COLUMNA];
        aleatorio = new Random();
        Celda[] celdas = Celda.values();
        for (int i = 0; i < mapa.length;i++){
            for (int j = 0; j < mapa[i].length;j++){
                int indice = aleatorio.nextInt(celdas.length);
                mapa[i][j] = celdas[indice];
            }
        }
        System.out.println(mapaToString(mapa));
    }
}
