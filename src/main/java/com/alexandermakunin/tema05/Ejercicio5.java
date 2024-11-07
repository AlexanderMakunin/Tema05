package com.alexandermakunin.tema05;

import java.util.Scanner;

public class Ejercicio5 {
    public static void palabraLarga(String pedir){
        System.out.println(pedir);
        Scanner leer = new Scanner(System.in);
        String texto = leer.nextLine();
        String asdf;
        String guardar = "";
        int contador;
        int cuenta = 0;
        String[] nombres = texto.split("\\s+");
        for (int j = 0; j < nombres.length; j++){
            asdf = nombres[j];
            contador = asdf.length();
            if (contador >= cuenta){
                cuenta = contador;
                guardar = asdf;
            }
        }
        System.out.println("La palabra mas larga es: " + guardar + " que contiene: " + cuenta);
    }
    public static void main(String[] args) {
        String texto = "Escribe una frase";
        palabraLarga(texto);
    }
}
