package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int resultado;
        System.out.println("Indique un numero");
        numero = leer.nextInt();
        if (numero<= 7 && numero>0) {
            resultado = switch (numero) {
            case 1 -> 6;
            case 2 -> 5;
            case 3 -> 4;
            case 4 -> 3;
            case 5 -> 2;
            case 6 -> 1;
            default -> -1;
            };
            System.out.println("El resultado opuesto es " + resultado);
        } else {
            System.out.println("Error");
        }
        leer.close();
    }
}