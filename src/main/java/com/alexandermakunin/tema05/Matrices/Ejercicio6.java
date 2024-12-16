package com.alexandermakunin.tema05.Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void notasAleatorias(float[][] notaEscolar){
        Random aleatorio = new Random();
        for (int i = 0; i < notaEscolar.length;i++){
            for (int j = 0; j < notaEscolar[i].length;j++){
                notaEscolar[i][j] = aleatorio.nextFloat(0,11);
            }
        }
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int я = 0;
        System.out.println("Cuantos alumnos?");
        int alumnos = Integer.parseInt(leer.nextLine());
        System.out.println("Cuantas asignaturas?");
        int asignaturas = Integer.parseInt(leer.nextLine());
        float[][] notaEscolar = new float[alumnos][asignaturas];
        notasAleatorias(notaEscolar);
        float notaMax = 0;
        for (int i = 0; i < notaEscolar.length;i++){
            System.out.print("Alumno " + (i+1));
            for (int j = 0; j < notaEscolar[i].length;j++){
                System.out.printf(" %.2f ",notaEscolar[i][j]);
                if (notaEscolar[i][j] > notaMax){
                    notaMax = notaEscolar[i][j];
                }
            }
            System.out.println();
        }
        System.out.printf("Nota Máxima: %.2f " , notaMax);
    }
}
