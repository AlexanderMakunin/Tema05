package com.alexandermakunin.tema05;

import java.util.Scanner;

import static com.alexandermakunin.tema05.Ejercicio2.contadorVocales;
import static com.alexandermakunin.tema05.Ejercicio5.palabraLarga;

public class Ejercicio13 {
    /**
     * Mostrara el menu principal para el usuario
     */
    public static void mostrarMenu(){
        Scanner leer = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println("1. Palabra más larga.");
            System.out.println("2. Palabra más corta.");
            System.out.println("3. Número de vocales.");
            System.out.println("------------------------------------");
            System.out.println("0. Salir");
            eleccion = Integer.parseInt(leer.nextLine());
            if (eleccion == 1){
                palabraLarga("Escribe 3 palabras seguidas, Ej: Hola que tal");
            } else if (eleccion == 2) {
                palabraCorta();
            } else if (eleccion == 3){
                numVocales();
            }
        } while (eleccion != 0);
        leer.close();
    }

    /**
     * Contara las vocales usando el ejercicio 2
     */
    public static void numVocales(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String texto = leer.nextLine();
        System.out.println("En total hay: " + contadorVocales(texto)+ " vocales");
    }

    /**
     * Guarda la palabra mas corta de la frase y al final la mostrara
     */
    public static void palabraCorta(){
        System.out.println("Escribe 3 palabras seguidas, Ej: Hola que tal");
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
            if (contador < cuenta){
                cuenta = contador;
                guardar = asdf;
            } else {
                cuenta = contador;
            }
        }
        System.out.println("La palabra mas corta es: " + guardar + " que contiene: " + cuenta);
    }
    public static void main(String[] args) {
        mostrarMenu();
    }
}