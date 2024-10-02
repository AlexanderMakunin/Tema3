package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float cuota = 500;
        int edad;
        float paga;
        System.out.println("Indique un numero");
        edad = leer.nextInt();
        if (edad >= 65) {
            paga = 500 % 50;
            System.out.print("Tiene que parar " + paga);
        } else if () {
            System.out.print("Es impar");
        }
    }
}