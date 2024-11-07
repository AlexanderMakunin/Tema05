package com.alexandermakunin.tema05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class Ejercicio18 {
    public static int luckyNumber(String numeros){
        char numero;
        String gfjdsh = "";
        gfjdsh = gfjdsh + numeros;
        int reusltado = 0;
        for(int i = 0; i<=gfjdsh.length()-1;i++){
            numero = gfjdsh.charAt(i);
            reusltado = reusltado + getNumericValue(numero);
        }
        int num1 = 0;
        int num2 = 0;
        String hola = "";
        hola = hola + reusltado;
        num1 = getNumericValue(hola.charAt(0));
        num2 = getNumericValue(hola.charAt(1));
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique su fecha de nacimiento con el formato: dd-mm-yyyy");
        String fechaNacimiento = leer.nextLine();
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = LocalDate.parse(fechaNacimiento,sdf);
        String Nacimiento = fecha.toString();
        int algo = 0;
        String UwU = Nacimiento.replace("-", "");
        int NumeroDeLaSuerte = luckyNumber(UwU);
        System.out.println(NumeroDeLaSuerte);
    }
}
