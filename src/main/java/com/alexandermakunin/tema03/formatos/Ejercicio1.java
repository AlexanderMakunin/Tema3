package com.alexandermakunin.tema03.formatos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        float i;
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique un numero real");
        i = Float.parseFloat(leer.nextLine());
        System.out.printf("Los dos primeros decimales de: %.2f es %.2f\n",i,i);
    }
}