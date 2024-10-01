package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float numero;
        System.out.println("Indique un numero");
        numero = leer.nextFloat();
        if (numero % 2 == 0) {
            System.out.print("Es par");
        } else {
            System.out.print("Es impar");
        }
    }
}