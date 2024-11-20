package com.alexandermakunin.tema05.arrays;

public class Ejercicio8 {
    public static boolean comprobarNum(int [] array, int num){
        for (int i = 0; i < array.length;i++){
            if (num == array[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {53, 15, -22, 60, 6, 8 ,14, -75, 12, 64};
        int numero = 7;
        System.out.println(comprobarNum(array,numero));
    }
}
