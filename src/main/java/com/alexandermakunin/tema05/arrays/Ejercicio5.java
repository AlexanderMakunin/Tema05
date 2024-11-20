package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int superaMedia = 0;
        System.out.println("Cuantas personas?");
        int cantidad = Integer.parseInt(leer.nextLine());
        float [] estaturas = new float[cantidad];
        for (int i = 0; cantidad > i; i++){
            System.out.println("Dime la estatura");
            estaturas[i] = Float.parseFloat(leer.nextLine());
        }
        leer.close();
        float contador = 0;
        for ( float numero : estaturas){
            contador += numero;
        }
        float media = contador / estaturas.length;
        for (int i = 0; i < estaturas.length; i++){
            if (media <= estaturas[i]){
                superaMedia++;
            }
        }
        System.out.println("La media es: " + media);
        System.out.println("Hay "+ superaMedia +" que supera la media");
    }
}