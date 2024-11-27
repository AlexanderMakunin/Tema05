package com.alexandermakunin.tema05.Array_Busca_Ordenacion;

import java.util.Arrays;
import java.util.Random;

public class ordenacion {
    public static void ordenaSeleccion (int[] array){
        for (int i = 0; i < array.length; i++){
            int min = array[i];
            int posicion = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    posicion = j;
                }
            }
            if (min < array[i]){
                intercambioArray(array,i,posicion);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void insercion (int [] array){
        int aux;
        for (int i = 1; i < array.length; i++){
            int j;
            aux = array[i];
            for (j = i-1; j >= 0; j--){
                if (array[j] < aux) {
                    break;
                }
                else if (array[j] >= aux){
                    array[j+1] = array[j];
                    //array[j] = aux;
                }
            }
            array[j + 1] = aux;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void ordenacionConteo (int[] array){
        final int UMBRAL = 100000;
        ArrayEstadistica arrayEstadistica = new ArrayEstadistica(array);
        int min = arrayEstadistica.getMin();
        int max = arrayEstadistica.getMax();
        if (max - min + 1 > UMBRAL) {
            System.out.println(min + " " + max);
            return;
        }
        int [] arrayConteo = new int[max+1];
        for (int i = 0; i < array.length; i++){
            arrayConteo[array[i]]++;
        }

        int contador = 0;
        for (int i = 0; i < arrayConteo.length; i++){
            int cantidad = arrayConteo[i];
            for (int j = 0; j < cantidad; j++){
                array[contador++] = i;
            }
        }
        System.out.println("Conteo: " + Arrays.toString(arrayConteo));
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static void intercambioArray(int[] array, int origen, int destino){
        int cambio = array[origen];
        array[origen] = array[destino];
        array[destino] = cambio;
    }
    public static void ordenacionBurbuja(int[] array){
        int ultimaPosicion = array.length;
        for (int i = 0; i < ultimaPosicion*2;i++){
            boolean hayCambios = false;
            for (int j = 0; j < ultimaPosicion - 1; j++){
                if (array[j] > array[j + 1]){
                    intercambioArray(array,j,j + 1);
                    hayCambios = true;
                }
            }
            if (!hayCambios){
                return;
            }
            ultimaPosicion--;
        }
    }


    public static void main(String[] args) {
        int [] array = new int [10];
        Random random = new Random();
        for (int i = 0; i < array.length;i++){
            array[i] = random.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));
        //ordenaSeleccion(array);
        //insercion(array);
        //ordenacionBurbuja(array);
        //System.out.println(Arrays.toString(array));
        //ordenacionConteo(array);
    }
}
