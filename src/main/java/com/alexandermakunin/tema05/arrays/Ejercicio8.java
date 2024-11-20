package com.alexandermakunin.tema05.arrays;

public class Ejercicio8 {
    /**
     * Revisa si el num esta en el array
     * @param array el array a recibir
     * @param num el num a comprobar
     * @return devuelve si lo contiene o no
     */
    public static boolean comprobarNum(int [] array, double num){
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
