package com.alexandermakunin.tema04;

public class Ejercicio3 {
    /**
     * contara los espacios que hay en el texto
     * @param texto el texto
     * @return devolvera la cantidad de espacios que hay en el texto
     */
    public static int contadorEspacios(String texto){
        String bajado = texto.toLowerCase();
        int cuentaEspacios = 0;
        char letra;
        char[] array = bajado.toCharArray();
        for (int i = 0; i <= array.length -1; i++){
            letra = array[i];
            if (letra == ' '){
                cuentaEspacios++;
            }
        }
        return cuentaEspacios;
    }

    public static void main(String[] args) {
        String texto = "hoLa Que Talees";
        System.out.println("En total hay: " + contadorEspacios(texto) + " espacios");
    }
}
