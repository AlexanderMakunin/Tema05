package com.alexandermakunin.tema05;

//actividad a realizar: crea un programa que al pasarle una frase sube el inicial de la frase a mayusculas, ej: hola -> Hola

public class Ejercicio1 {
    /**
     * pilla la primera inicial y la separa del texto para luego volver mayuscula y juntar ambas
     * @param texto el texto
     * @return devuelve el texto pero con la inicial subida
     */
    public static String subirInicial(String texto){
        char letra = texto.charAt(0);
        String subir = String.valueOf(letra);
        String subido = subir.toUpperCase();
        String sobrante = texto.substring(1);
        return subido.concat(sobrante);
    }

    public static void main(String[] args) {
        String texto = "·oLa";
        System.out.println(subirInicial(texto));
    }
}
