package com.alexandermakunin.tema05;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = "hoLa Que Taleeñs";
        String bajado = texto.toLowerCase();
        String asdf;
        String guardar = "";
        int contador;
        int cuenta = 0;
        String[] nombres = bajado.split("\\s+");
        for (int j = 0; j < nombres.length; j++){
            asdf = nombres[j];
            contador = asdf.length();
            if (contador >= cuenta){
                cuenta = contador;
                guardar = asdf;
            }
        }
        System.out.println("La palabra mas larga es: " + guardar + " ,que contiene: " + cuenta);
    }
}
