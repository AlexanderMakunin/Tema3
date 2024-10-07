package com.alexandermakunin.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        int b = 0;

        do {
            System.out.println("Indique un numero del 1 al 10");
            a = Integer.parseInt(leer.nextLine());
        }while( a > 10);
        if(a < 1 && a > 10);{
            for ( int x = 1; x <= 10; x++) {
                b = a + b;
                System.out.println("El resultado es: " + b);
            }
        }

        leer.close();
    }
}

