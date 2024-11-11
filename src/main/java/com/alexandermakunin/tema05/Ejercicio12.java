package com.alexandermakunin.tema05;

public class Ejercicio12 {
    /**
     * remplaza es a no por
     * @param texto el texto
     * @return devuelve el texto pero remplazando es a no por
     */
    public static String sustituirEs(String texto){
        return texto.replaceAll("es","no por");
    }

    /**
     * remplaza los numeros por *
     * @param texto el texto
     * @return el texto pero remplazando numeros por *
     */
    public static String remplazarNum(String texto){
        return texto.replaceAll("\\d+", "*");
    }
    //que mrd es cadena de carecteres
    public static void main(String[] args) {
        String texto = "«esto1234es5678bueno900»";
        System.out.println(remplazarNum(texto));
        System.out.println(sustituirEs(texto));
    }
}
