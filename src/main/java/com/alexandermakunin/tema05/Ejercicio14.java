package com.alexandermakunin.tema05;

import java.util.Scanner;

public class Ejercicio14 {
    /**
     * Sustituye un numero por un caracter
     * @param num el numero
     * @param letra la letra que sustituira el numero
     * @return la letra sustituida por el numero
     */
    public static String imprimir (int num, char letra){
        String texto = "";
        texto = texto + num;
        char asdf = texto.charAt(0);
        return  texto.replace(asdf, letra);
    }
    public static void main(String[] args) {
        int num = 3;
        char letra = 'C';
        int x = 0;
        int y = 0;
        int z = 0;
        int terminar = 9;
        for (int i = 0; z<terminar; i++) {
            String sustituirI = "";
            String sustituirX = "";
            String sustituirY = "";
            String sustituirZ = "";
            if (i >= 10){
                i = 0;
                x++;
            }
            if (x >= 10) {
                x = 0;
                y++;
            }
            if (y >= 10) {
                y = 0;
                z++;
            }
            if (i == num){
                sustituirI = (imprimir(num, letra));
            } else if (i != num){
                sustituirI = sustituirI + i;
            }
            if (x == num){
                sustituirX = (imprimir(num, letra));
            } else if (x != num){
                sustituirX = sustituirX + x;
            }
            if (y == num){
                sustituirY = (imprimir(num, letra));
            } else if (y != num){
                sustituirY = sustituirY + y;
            }
            if (z == num){
                sustituirZ = (imprimir(num, letra));
            } else if (z != num){
                sustituirZ = sustituirZ + z;
            }
            System.out.println(sustituirZ+"-"+sustituirY+"-"+sustituirX+"-"+sustituirI);
        }
    }
}
