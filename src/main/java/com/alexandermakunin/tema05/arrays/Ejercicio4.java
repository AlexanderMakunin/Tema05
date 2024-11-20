package com.alexandermakunin.tema05.arrays;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        double [] notas = new double[30];
        for (int i = 0; i < notas.length; i++){
            notas[i] = aleatorio.nextDouble(0,11);
        }
        double contador = 0;
        for ( double numero : notas){
            contador += numero;
        }
        double media = contador / notas.length;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        String espacio = "";
        String coma = ",";
        for (int i = 0; i < notas.length; i++){
            if (i == notas.length -1){
                coma = "";
            }
            if (notas[i] >= 5) {
                sb.append(espacio).append(String.format("%.4f", notas[i])).append(coma);
            }
            if (i == 0){
                espacio = " ";
            }
        }
        sb.append("}");
        System.out.println(sb);
        System.out.printf("La media es: %1.4f",media);
    }
}