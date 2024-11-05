package com.alexandermakunin.tema04;

public class Ejercicio1 {
    public static String subirInicial(String texto){
        char letra = texto.charAt(0);
        String bajar = String.valueOf(letra);
        String bajado = bajar.toUpperCase();
        String sobrante = texto.substring(1);
        String resultado = bajado.concat(sobrante);
        return resultado;
    }

    public static void main(String[] args) {
        String texto = "hoLa";
        System.out.println(subirInicial(texto));
    }
}
