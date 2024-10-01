package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Indique su calificación");
        numero = leer.nextInt();
        switch (numero) {
            case 0,1,2,3,4 -> System.out.print("Insuficiente");
            case 5 -> System.out.print("Suficiente");
            case 6 -> System.out.print("Bien");
            case 7,8 -> System.out.print("Notable");
            case 9,10 -> System.out.print("Sobresaliente");
            default -> System.out.print("Error");
        }
    }
}