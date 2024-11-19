package com.alexandermakunin.tema05;

import java.util.Scanner;

public class Ejercicio11 {
    //que mrd es tres cadenas de carecteres
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cuentaBajada = 0;
        int cuentaSubida = 0;
        char letra;
        System.out.println("Escriba su nombre completo");
        String nombreCompleto = leer.nextLine();
        char[] arrayBajado = nombreCompleto.toLowerCase().toCharArray();
        char ultimaLetra = nombreCompleto.toLowerCase().charAt(nombreCompleto.length()-1);
        char primeraLetra = nombreCompleto.toUpperCase().charAt(0);
        String primeraLetraString = nombreCompleto.toUpperCase();
        char primeraLetraBajada = nombreCompleto.toLowerCase().charAt(0);
        System.out.println("a)");
        System.out.println(nombreCompleto.toLowerCase());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto.length());
        System.out.println("b)");
        if (nombreCompleto.length() >= 5) {
            System.out.println(nombreCompleto.substring(0, 5));
        } else {
            System.out.println(nombreCompleto);
        }
        System.out.println("c)");
        if (nombreCompleto.length() >= 5) {
            System.out.println(nombreCompleto.substring(nombreCompleto.length()-2));
        } else {
            System.out.println(nombreCompleto);
        }
        System.out.println("d)");
        for (int i = 0; i <= nombreCompleto.length()-1; i++){
            letra = arrayBajado[i];
            if (letra == ultimaLetra){
                cuentaBajada++;
            }
        }
        System.out.println(cuentaBajada);
        System.out.println("e)");
        System.out.println(nombreCompleto.replace(primeraLetraBajada,primeraLetra));
        System.out.println("f)");
        String estrellitas = "***";
        String nombreCompletoConEstrellas = estrellitas + nombreCompleto + estrellitas;
        System.out.println(nombreCompletoConEstrellas);
        System.out.println("g)");
        StringBuilder sb = new StringBuilder();
        sb.append(nombreCompleto);
        System.out.println(sb.reverse());
    }
}
