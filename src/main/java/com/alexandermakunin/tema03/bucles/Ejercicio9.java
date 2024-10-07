package com.alexandermakunin.tema03.bucles;

public class Ejercicio9 {
    public static void main(String [] args) {
        int suma = 0;
        int a = 7;
        int x = 1;

        for ( x = 1; x<= a ; x++) {
        } if (a == 1 || a == 2 || a == 3){
            System.out.println("Es primo");
        } else if (a % x == 0 && a % 2 != 0 || a % 3 != 0){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }
}