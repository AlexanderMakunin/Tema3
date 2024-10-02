package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;
        System.out.println("Indique un lado");
        lado1 = leer.nextInt();
        System.out.println("Indique el segundo lado");
        lado2 = leer.nextInt();
        System.out.println("Indique el tercer lado");
        lado3 = leer.nextInt();
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Es un triangulo equilatero ");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3 && lado1 == lado2 || lado1 == lado3 || lado2 == lado3 ) {
            System.out.println("Es un triangulo isoceles");
        } else {
            System.out.println("Es un triangulo escaleno");
        }
        leer.close();
    }
}