package com.alexandermakunin.tema05;

public class Ejercicio4 {
    /**
     * contara las vocales que hay en la palabra
     * @param palabra el palabra
     * @return devolvera la cantidad de vocales en la palabra
     */
    public static int contadorVocales(String palabra) {
        int cuentaVocales = 0;
            for (int j = 0; j < palabra.length(); j++) {
                char letra;
                char[] array = palabra.toCharArray();
                letra = array[j];
                switch (letra) {
                    case 'a', 'e', 'i', 'o', 'u' -> cuentaVocales++;
                }
            }
        return cuentaVocales;
    }

    /**
     * contara las consonantes que hay en la palabra
     * @param palabra la palabra
     * @return devolvera la cantidad de consonantes en la palabra
     */
    public static int contadorConsonantes(String palabra){
        int cuentaConsonantes = 0;
        for (int i = 0; i <= palabra.length() -1; i++){
            char letra;
            char[] array = palabra.toCharArray();
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
        String[] palabra = bajado.split("\\s+");
        for (int j = 0; j < palabra.length; j++) {
            System.out.println("La palabra "+ palabra[j] + " tiene: " + contadorVocales(palabra[j]) + " vocales, y " + contadorConsonantes(palabra[j]) + " consonantes");
        }
    }
}
