package com.alexandermakunin.tema05;

public class Ejercicio8 {
    /**
     * contara los caracteres que contiene cada palabra de la frase
     * @param texto el texto
     * @return devolvera la cantidad de caracteres que contiene cada palabra de la frase
     */
    public static int cuentaChar(String texto) {
        int cuentaChar = 0;
        for (int j = 0; j < texto.length(); j++) {
            char letra;
            char[] array = texto.toCharArray();
            letra = array[j];
            if (letra != ' '){
                cuentaChar++;
            }
        }
        return cuentaChar;
    }

    public static void main(String[] args) {
        String texto = "hoLa Que Taleeñs";
        String bajado = texto.toLowerCase();
        String[] nombres = bajado.split("\\s+");
        System.out.println("La palabra contiene: ");
        for (int j = 0; j < nombres.length; j++) {
            System.out.printf("%-10s%-4s \n",nombres[j],cuentaChar(nombres[j]));
        }
    }
}
