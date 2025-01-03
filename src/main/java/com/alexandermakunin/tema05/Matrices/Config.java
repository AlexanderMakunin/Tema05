package com.alexandermakunin.tema05.Matrices;

public class Config {
    // Constantes de configuración general
    public static final int FILAS = 8;
    public static final int COLUMNAS = FILAS * 4;
    public static final int USOS_PICO = 3;
    public static final int CANTIDAD_OBSTACULOS = FILAS - 1;
    public static final int CANTIDAD_NPC = Math.min(FILAS * COLUMNAS / 20, 4);
    public static final int CANTIDAD_HABILIDADES = CANTIDAD_NPC;
    public static final char UP = 'w';
    public static final char LEFT = 'a';
    public static final char RIGHT = 'd';
    public static final char DOWN = 's';
    public static final char DIG = 'e';

    // Constantes para sprites
    public static final String SPRITE_JUGADOR = "@";
    public static final String SPRITE_OBSTACULO = "▓";
    public static final String SPRITE_NPC = "N";
    public static final String SPRITE_TESORO = "T";
    public static final String SPRITE_VACIA = " ";
    public static final String SPRITE_HABILIDAD = "?";
    public static final String SPRITE_EXCAVADA = "*";



}
