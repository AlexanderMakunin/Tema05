package com.alexandermakunin.tema05.Array_Busca_Ordenacion;

public class busquedaBinaria {
    public static void main(String[] args) {
        int[] array = {1,20,30,50,80,100,200,1000};
        int buscar = 20;
        int inicio = 0;
        int fin = array.length - 1;
        boolean encontrado = false;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (array[medio] == buscar) {
                encontrado = true;
                break;
            }

            if (array[medio] < buscar) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        if (!encontrado){
            System.out.println("no esta en el array en numero buscado");
        } else {
            System.out.println("esta en el array");
        }
    }
}
