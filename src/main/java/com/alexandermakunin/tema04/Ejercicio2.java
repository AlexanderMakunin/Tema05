package com.alexandermakunin.tema04;

public class Ejercicio2 {
    public static int contadorVocales(String texto){
        String bajado = texto.toLowerCase();
        int cuenta = 0;
        char letra;
        char[] array = bajado.toCharArray();
        for (int i = 1; i <= array.length; i++){
            letra = array[i];
            switch (letra){
                case 'a','e','i','o','u' -> cuenta++;
            }
            System.out.println("asdf");
        }
        return cuenta;
    }

    public static void main(String[] args) {
        String texto = "hoLa";
        System.out.println(contadorVocales(texto));
    }
}
