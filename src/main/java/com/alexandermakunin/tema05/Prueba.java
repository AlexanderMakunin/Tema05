package com.alexandermakunin.tema05;

import java.util.Scanner;

public class Prueba {
    /**
     * Aqui es donde se hace la operacion de suma
     */
    public static void suma(){
        Scanner leer = new Scanner(System.in);
        int x,y,resultado;
        System.out.println("Pon un numero para sumar");
        x = Integer.parseInt(leer.nextLine());
        System.out.println("Pon un numero para sumar");
        y = Integer.parseInt(leer.nextLine());
        resultado = x+y;
        System.out.println("El resultado es: "+ resultado);
    }
    /**
     * Aqui es donde se hace la operacion de restar
     */
    public static void restar(){
        Scanner leer = new Scanner(System.in);
        int x,y,resultado;
        System.out.println("Pon un numero para restar");
        x = Integer.parseInt(leer.nextLine());
        System.out.println("Pon un numero para restar");
        y = Integer.parseInt(leer.nextLine());
        resultado = x-y;
        System.out.println("El resultado es: "+ resultado);
    }
    /**
     * Aqui es donde se hace la operacion de multiplicar
     */
    public static void multiplicar(){
        Scanner leer = new Scanner(System.in);
        int x,y,resultado;
        System.out.println("Pon un numero para multiplicar");
        x = Integer.parseInt(leer.nextLine());
        System.out.println("Pon un numero para multiplicar");
        y = Integer.parseInt(leer.nextLine());
        resultado = x*y;
        System.out.println("El resultado es: "+ resultado);
    }
    /**
     * Aqui es donde se hace la operacion de dividir
     */
    public static void dividir(){
        Scanner leer = new Scanner(System.in);
        int x,y,resultado;
        System.out.println("Pon un numero para dividir");
        x = Integer.parseInt(leer.nextLine());
        System.out.println("Pon un numero para dividir");
        y = Integer.parseInt(leer.nextLine());
        resultado = x/y;
        System.out.println("El resultado es: "+ resultado);
    }

    /**
     * Aqui es donde se hace la operacion de divir y se muestre los restos
     */
    public static void dividirRestos(){
        Scanner leer = new Scanner(System.in);
        float x,y,resultado;
        System.out.println("Pon un numero para dividir");
        x = Integer.parseInt(leer.nextLine());
        System.out.println("Pon un numero para dividir");
        y = Integer.parseInt(leer.nextLine());
        resultado = x/y;
        System.out.println("El resultado es: "+ resultado);
    }

    /**
     * Aqui es donde se realiza el sub menu de operaciones
     */
    public static void operaciones(){
        Scanner leer = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("*****************************\n" + "** OPERACIONES ARITMÉTICAS **\n" + "*****************************");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto de la división");
            System.out.println("--------------------------");
            System.out.println("0. Salir del programa\n");
            System.out.println("Elija una opción:");
            eleccion = Integer.parseInt(leer.nextLine());
            switch (eleccion){
                case 1 ->suma();
                case 2 ->restar();
                case 3 ->multiplicar();
                case 4 ->dividir();
                case 5 ->dividirRestos();
            }
        }while (eleccion != 0);
    }

    /**
     * Aqui es donde iria decimal a binario
     */

    public static void decimalBinario() {
        Scanner leer = new Scanner(System.in);
        int x;
        int y =1;
        String resultado = "";
        System.out.println("Pon un numero para pasarlo a binario");
        x = Integer.parseInt(leer.nextLine());
        if (x > 0) {
            while (x>=1){
                y=y*2;
                if (y>=x){
                    resultado = resultado+0;
                    x=y-x;
                    y=1;
                    //si quitas esta parte del codigo se queda en un bucle infinito
                    if (x<=1){
                        break;
                    }
                } else {
                    resultado = resultado+1;
                }
            }
            System.out.printf("El resultado es: %s\n", resultado);
            //nada hecho aun
        } else{
            System.out.println("El resultado es: " + x);
        }
    }
    /*
     * Aqui es donde iria decimal a hexadecimal
     */

    public static void decimalHexadecimal(){
        //nada hecho aun
    }
    /**
     * Aqui es donde iria binario a decimal
     */
    public static void binarioDecimal(){
        //nada hecho aun
    }
    /**
     * Aqui es donde iria binario a hexadecimal
     */
    public static void binarioHexadecimal(){
        //nada hecho aun
    }
    /**
     * Aqui es donde iria hexadecimal a binario
     */
    public static void hexadecimalBinario(){
        //nada hecho aun
    }
    /**
     * Aqui es donde iria hexadecimal a binario
     */
    public static void hexadecimalDecimal(){
        //nada hecho aun
    }

    /**
     * Aqui es donde esta el sub menu de conversiones
     */

    public static void conversiones(){
        Scanner leer = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("*****************************\n" + "** CONVERSIONES DE BASE **\n" + "*****************************");
            System.out.println("1. De decimal a binario");
            System.out.println("2. De decimal a hexadecimal");
            System.out.println("3. De binario a decimal");
            System.out.println("4. De binario a hexadecimal");
            System.out.println("5. De hexadecimal a binario");
            System.out.println("6. De hexadecimal a decimal");
            System.out.println("--------------------------");
            System.out.println("0. Salir del programa\n");
            System.out.println("Elija una opción:");
            eleccion = Integer.parseInt(leer.nextLine());
            switch (eleccion){
                case 1 ->decimalBinario();
                case 2 ->decimalHexadecimal();
                case 3 ->binarioDecimal();
                case 4 ->binarioHexadecimal();
                case 5 ->hexadecimalBinario();
                case 6 ->hexadecimalDecimal();
            }
        }while (eleccion != 0);
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("*****************\n" + "** CALCULADORA **\n" + "*****************");
            System.out.println("1. Operaciones aritméticas");
            System.out.println("2. Conversiones de base");
            System.out.println("--------------------------");
            System.out.println("0. Salir del programa\n");
            System.out.println("Elija una opción:");
            eleccion = Integer.parseInt(leer.nextLine());
            if (eleccion == 1){
                operaciones();
            } else if (eleccion == 2) {
                conversiones();
            }
        }while (eleccion != 0);
    }
}
