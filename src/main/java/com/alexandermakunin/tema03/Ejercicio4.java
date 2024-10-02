package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float numero;
        float numero2;
        System.out.println("Indique un numero real");
        numero = leer.nextFloat();
        System.out.println("Indique otro numero real");
        numero2 = leer.nextFloat();
        if (numero > numero2) {
            System.out.print("La respuesta es " + numero2 + " " + numero);
        } else {
            System.out.print("La respuesta es " + numero + " " + numero2);
        }leer.close();
    }
}