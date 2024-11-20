package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
    public static float [] divisionArrays(int [] array1, int [] array2){
        if (array1.length != array2.length){
            return null;
        }
        float [] arraySuma = new float[array1.length];
        for (int i = 0; i < array1.length;i++){
            arraySuma[i] = (float) array1[i] / array2[i];
        }
        return arraySuma;
    }
    public static int [] sumaArrays(int [] array1, int [] array2){
        int [] arraySuma = new int[10];
        for (int i = 0; i < array1.length;i++){
            arraySuma[i] = array1[i] + array2[i];
        }
        return arraySuma;
    }
    public static void main(String[] args) {
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        Random aleatorio = new Random();
        for (int i = 0; i < array1.length; i++){
            array1[i] = aleatorio.nextInt(1,11);
        }
        for (int i = 0; i < array2.length; i++){
            array2[i] = aleatorio.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(sumaArrays(array1,array2)));
        System.out.println(Arrays.toString(divisionArrays(array1,array2)));
    }
}