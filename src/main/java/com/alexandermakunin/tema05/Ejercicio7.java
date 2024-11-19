package com.alexandermakunin.tema05;

public class Ejercicio7 {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        String[] nombres = texto.split("\\s+");
        String mostrarTexto;
        for (int i = 0;i<=nombres.length -1;i++){
            mostrarTexto = nombres[i];
            System.out.println(mostrarTexto);
        }
    }
}
