package com.alexandermakunin.tema05;

import java.util.Scanner;

public class Ejercicio15 {
    public static String bloqueTexto(int alto, int ancho, char algo){
        String resultado = "";
        for (int i = 1; alto >= i; i++){
            resultado = resultado+"\n";
            for (int j = 1; ancho >= j; j++){
                resultado = resultado + algo;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el alto");
        int alto = Integer.parseInt(leer.nextLine());
        System.out.println("Dime el ancho");
        int ancho = Integer.parseInt(leer.nextLine());
        System.out.println("Dime un caracter");
        char caracter = leer.nextLine().charAt(0);
        System.out.println(bloqueTexto(alto,ancho,caracter));
    }
}
