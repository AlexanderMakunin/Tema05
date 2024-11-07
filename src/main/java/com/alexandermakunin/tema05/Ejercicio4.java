package com.alexandermakunin.tema05;

public class Ejercicio4 {
    /**
     * contara las vocales que hay en el texto
     * @param texto el texto
     * @return devolvera la cantidad de vocales en el texto
     */
    public static int contadorVocales(String texto) {
        int cuentaVocales = 0;
            for (int j = 0; j < texto.length(); j++) {
                char letra;
                char[] array = texto.toCharArray();
                letra = array[j];
                switch (letra) {
                    case 'a', 'e', 'i', 'o', 'u' -> cuentaVocales++;
                }
            }
        return cuentaVocales;
    }

    /**
     * contara las consonantes que hay en el texto
     * @param texto el texto
     * @return devolvera la cantidad de consonantes en el texto
     */
    public static int contadorConsonantes(String texto){
        int cuentaConsonantes = 0;
        for (int i = 0; i <= texto.length() -1; i++){
            char letra;
            char[] array = texto.toCharArray();
            letra = array[i];
            switch (letra){
                case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z' -> cuentaConsonantes++;
            }
        }
        return cuentaConsonantes;
    }

    public static void main(String[] args) {
        String texto = "hoLa Que Taleeñs";
        String bajado = texto.toLowerCase();
        String[] nombres = bajado.split("\\s+");
        for (int j = 0; j < nombres.length; j++) {
            System.out.println("En total hay: " + contadorVocales(nombres[j]) + " vocales, y " + contadorConsonantes(nombres[j]) + " consonantes");
        }
    }
}
