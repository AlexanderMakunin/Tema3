package com.alexandermakunin.tema03.bucles;

public class Ejercicio8 {
    public static void main(String [] args) {
        int suma = 1;
        int a = 5;
        for ( int x = a; x >= 1; x--) {
            suma = suma * a;
            a--;
        } System.out.println("La suma es " + suma);
    }
}