package com.alexandermakunin.tema05;

public class Ejercicio10 {
    /**
     *comprobar si el texto es palindromo (se lee igual de izquierda que derecha o lo mismo que normal y al reves)
     * @param texto la frase
     * @return si es palindromo o no
     */
    public static boolean palindromo(String texto){
        boolean resultado;
        String textoSinEspacio = texto.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder();
        sb.append(textoSinEspacio);
        sb.reverse();
        String reverso = sb.toString();
        resultado = textoSinEspacio.equals(reverso);
        return resultado;
    }
    public static void main(String[] args) {
        String s1 = "Hola Mundo";
        String s2 = "Hola aloH";
        String s3 = "ab";
        String s4 = "asi mario oira misa";
        System.out.println(palindromo(s4));

    }
}
