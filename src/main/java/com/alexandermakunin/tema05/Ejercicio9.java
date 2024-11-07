package com.alexandermakunin.tema05;

public class Ejercicio9 {
    /**
     * devolvera los caracteres impares
     * @param texto el texto
     * @return devolvera los caracteres impares
     */
    public static String devuelveEspacio(String texto){
        char letra;
        char[] array = texto.toCharArray();
        String algo = "";
        for (int i = 0; i <= array.length -1; i++,i++){
            letra = array[i];
            algo = algo + letra;
            System.out.println(algo);
        }
        return algo;
    }

    public static void main(String[] args) {
        String texto = "hoLa Que Tal";
        System.out.println(devuelveEspacio(texto));
    }
}
