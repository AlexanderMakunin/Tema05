package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

    public static void crearArray(int[] array){
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = aleatorio.nextInt(1,51);
        }
    }

    public static void visualizarArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void visualizarPares(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                System.out.println("Esta en la posocion "+ i+ " y el numero es: " +(array[i]));
            }
        }
    }

    public static void visualizarMultiplos3(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 3 == 0){
                System.out.println("Esta en la posocion "+ i+ " y el numero es: " +(array[i]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int[] array = new int[10];
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = aleatorio.nextInt(1,51);
        }
        int opcion;
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println("1.-Rellenar array.");
            System.out.println("2.-Visualizar contenido del array");
            System.out.println("3.-Visualizar contenido par.");
            System.out.println("4.-Visualizar contenido múltiplo de 3");
            System.out.println("0.-Salir del menú.");
            System.out.println("Selecciona una opción: ");
            opcion = Integer.parseInt(leer.nextLine());
            switch (opcion){
                case 1 -> crearArray(array);
                case 2 -> visualizarArray(array);
                case 3 -> visualizarPares(array);
                case 4 -> visualizarMultiplos3(array);
            }
        } while (opcion != 0);
    }

}
