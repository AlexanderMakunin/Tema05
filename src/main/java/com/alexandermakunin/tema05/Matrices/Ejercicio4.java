package com.alexandermakunin.tema05.Matrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 8;
        int [][] matriz = new int[FILAS][COLUMNAS];
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = aleatorio.nextInt(1,11);
            }
        }
        System.out.println("Apartado a)");
        for (int[] fila : matriz){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("Apartado b)");
        int [][] matrizInvertida = new int[COLUMNAS][FILAS];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length;j++){
                matrizInvertida[j][i] = matriz[i][j];
            }
        }
        for (int[] fila : matrizInvertida){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("Apartado c)");
        int sumaFilas;
        for (int i = 0; i < matriz.length; i++){
            sumaFilas = 0;
            for (int j = 0; j < matriz[i].length;j++){
                sumaFilas = sumaFilas + matriz[i][j];
            }
            System.out.println(Arrays.toString(matriz[i]));
            System.out.println("El total de la fila es: " + sumaFilas);
        }
        System.out.println("Apartado d)");
        int min = matriz[0][0];
        int max = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length;j++){
                if (matriz[i][j] > max){
                    max = matriz[i][j];
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        System.out.println("El mayor numero es: " + max);
        System.out.println("El menor numero es: " + min);

        System.out.println("Apartado e)");
        float media;
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length;j++){
                suma = suma + matriz[i][j];
                contador++;
            }
        }
        media = (float) suma / contador;
        System.out.println("La media es: " + media);

        System.out.println("Apartado f)");
        Scanner leer = new Scanner(System.in);
        int fila;
        int columna;
        System.out.println("Dime la fila?");
        fila = Integer.parseInt(leer.nextLine());
        System.out.println("Dime la columna?");
        columna = Integer.parseInt(leer.nextLine());
        System.out.println(matriz[fila][columna]);

        System.out.println("Apartado g)");
        System.out.println("Dime la fila?");
        fila = Integer.parseInt(leer.nextLine());
        System.out.println(Arrays.toString(matriz[fila]));

        System.out.println("Apartado h)");
        System.out.println("Dime la columna?");
        columna = Integer.parseInt(leer.nextLine());
        int [] matrizColumnas = new int[FILAS];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == columna){
                    matrizColumnas[i] = matriz[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(matrizColumnas));

        System.out.println("Apartado i)");
        int j;
        for (int i = 0; i < matriz.length; i++){
            suma = 0;
            for (j = 0; j < matriz[i].length-1;j++){
                suma = suma + matriz[i][j];
            }
            matriz[i][j] = suma;
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
