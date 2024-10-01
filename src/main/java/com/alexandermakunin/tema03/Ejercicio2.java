package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.println("Indique un numero");
        numero = leer.nextInt();
        System.out.println("Indique otro numero");
        numero2 = leer.nextInt();
        if (numero > numero2) {
            System.out.print(numero + " Es mayor que " + numero2);
        } else if (numero < numero2) {
            System.out.print(numero + "Es menor que" + numero2);
        } else {
            System.out.print("Son iguales" );
        }
    }
}