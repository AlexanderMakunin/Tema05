package com.alexandermakunin.tema05;

import java.util.Scanner;

import static com.alexandermakunin.tema05.Ejercicio16.calcularNIF;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca su NIF: ");
        String NIF = leer.nextLine();
        int NIFLongitud = NIF.length();
        char letraNIF = NIF.charAt(NIFLongitud-1);
        String NIFSinLetra = NIF.substring(0, NIFLongitud-1);
        int DNI = Integer.parseInt(NIFSinLetra);
        boolean resultado;
        String NIFCalculado = calcularNIF(DNI);
        char letraNIFCalculado = NIFCalculado.charAt(NIFLongitud-1);
        resultado = letraNIF == letraNIFCalculado;
        System.out.println("Su NIF es: " + resultado);
    }
}
