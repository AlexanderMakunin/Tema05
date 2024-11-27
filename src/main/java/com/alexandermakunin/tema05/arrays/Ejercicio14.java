package com.alexandermakunin.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio14 {
    public static void contarLetras(char[] array){
        int num;
        int numNY = 0;
        int j;
        int i;
        /*
        for (int i = 0; i < array.length; i++){
            num = 0;
            for (j = 'A'; j < 'Z' ; j++){
                if (j == array[i] || array[i] == 'Ñ'){
                    num++;
                }
            }
        }
         */
        for (j = 'A'; j <= 'Z' ; j++){
            num = 0;
            numNY = 0;
            for (i = 0; i < array.length; i++){
                if (j == array[i]){
                    num++;
                } else if (array[i] == 'Ñ') {
                    numNY++;
                }
            }
            System.out.println((char) j + " --> " + num);
        }
        System.out.println("Ñ --> " + numNY);
    }
    public static void crearArrayLetras(char[] array){
        Random random = new Random();
        int num;
        for (int i = 0; i < array.length; i++){
            num = random.nextInt(0,27);
            switch (num){
                case 0 -> array[i] = 'A';
                case 1 -> array[i] = 'B';
                case 2 -> array[i] = 'C';
                case 3 -> array[i] = 'D';
                case 4 -> array[i] = 'E';
                case 5 -> array[i] = 'F';
                case 6 -> array[i] = 'G';
                case 7 -> array[i] = 'H';
                case 8 -> array[i] = 'I';
                case 9 -> array[i] = 'J';
                case 10 -> array[i] = 'K';
                case 11 -> array[i] = 'L';
                case 12 -> array[i] = 'M';
                case 13 -> array[i] = 'N';
                case 14 -> array[i] = 'Ñ';
                case 15 -> array[i] = 'O';
                case 16 -> array[i] = 'P';
                case 17 -> array[i] = 'Q';
                case 18 -> array[i] = 'R';
                case 19 -> array[i] = 'S';
                case 20 -> array[i] = 'T';
                case 21 -> array[i] = 'U';
                case 22 -> array[i] = 'V';
                case 23 -> array[i] = 'W';
                case 24 -> array[i] = 'X';
                case 25 -> array[i] = 'Y';
                case 26 -> array[i] = 'Z';
            }
        }
    }
    public static void main(String[] args) {
        char [] letras = new char [500];
        crearArrayLetras(letras);
        contarLetras(letras);
    }
}
