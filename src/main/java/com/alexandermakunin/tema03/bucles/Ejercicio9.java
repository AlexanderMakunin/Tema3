package com.alexandermakunin.tema03.bucles;

public class Ejercicio9 {
    public static void main(String[] args) {
        int a = 100;
        int x = 1;

        for (x = 1; x <= a; x++) {
            if (a == 1 || a == 2 || a == 3) {
                System.out.println("Es primo");
                break;
            }else if (a == x) {
                System.out.println("Es primo");
            } else if (a % x == 0) {
                System.out.println("Es divisible entre: " + x);
            }

        }
    }
}