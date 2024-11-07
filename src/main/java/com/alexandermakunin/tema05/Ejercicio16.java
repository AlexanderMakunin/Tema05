package com.alexandermakunin.tema05;

import java.util.Scanner;

public class Ejercicio16 {
    /**
     * hara los calculos para sacar el NIF a partir del DNI
     * @param DNI el DNi del usuario
     * @return devolvera un string la cual es el NIF
     */
    public static String calcularNIF(int DNI){
        int numeroNIF = DNI % 23;
        char letraNif = switch (numeroNIF){
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            case 22 -> 'E';
            default -> '0';
        };
        String NIF = "";
        NIF = NIF + DNI + letraNif;
        return NIF;
    }

    /**
     * pedira el DNI del usuario
     * @return devolvera el DNI del usuario en un int
     */
    public static int solicitarDNI(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca su DNI: ");
        return Integer.parseInt(leer.nextLine());
    }
    public static void main(String[] args) {
        int DNI = solicitarDNI();
        String NIF = calcularNIF(DNI);
        System.out.println("Su NIF es: " + NIF);
    }
}
