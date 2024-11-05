package com.alexandermakunin.tema05;

//actividad a realizar: crea un programa que al pasarle una frase sube el inicial de la frase a mayusculas, ej: hola -> Hola

public class Ejercicio1 {
    public static String subirInicial(String texto){
        char letra = texto.charAt(0);
        String subir = String.valueOf(letra);
        String subido = subir.toUpperCase();
        String sobrante = texto.substring(1);
        return subido.concat(sobrante);
    }

    public static void main(String[] args) {
        String texto = "hoLa";
        System.out.println(subirInicial(texto));
    }
}
