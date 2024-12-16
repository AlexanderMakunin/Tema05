package com.alexandermakunin.tema05.Matrices;

public class Config {
    //Constantes de configuracion general
    public static final int FILAS = 8;
    public static final int COLUMNA = 8;
    public static final int USOS_PICO = 3;
    public static final int CANTIDAD_OBSTACULOS = FILAS - 1;
    public static final int CANTIDAD_NPC = FILAS * COLUMNA / 4;

    //Constantes para sprites
    public static final String SPRITE_JUGADOR = "@";
    public static final String SPRITE_OBSTACULO = "X";
    public static final String SPRITE_NPC = "N";
    public static final String SPRITE_TESORO = "1";
    public static final String SPRITE_VACIO = " ";
    public static final String SPRITE_HABILIDAD = "?";
    public static final String SPRITE_EXCAVADO = "*";
}
