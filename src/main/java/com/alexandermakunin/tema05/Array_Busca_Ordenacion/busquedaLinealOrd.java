package com.alexandermakunin.tema05.Array_Busca_Ordenacion;

public class busquedaLinealOrd {
    public static void main(String[] args) {
        int[] array = {1,20,100,100,1000};
        int buscar = 101;
        for (int i = 0; i <= array.length-1;i++){
            if (buscar == array[i]){
                System.out.println("se ha encontrado en la posicion: " + i);
                break;
            } else if (buscar < array[i]){
                System.out.println("no se ha encontrado");
                break;
            }
        }
    }
}
