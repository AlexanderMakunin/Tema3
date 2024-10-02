package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Indique su Edad");
        numero = leer.nextInt();
        if (numero >= 18) {
            System.out.print("Es mayor de edad");
        } else {
            System.out.print("Es menor de edad");
        } leer.close();
    }
}