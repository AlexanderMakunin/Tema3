package com.alexandermakunin.tema03.formatos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int h;
        int m;
        int s;
        do {
            System.out.println("Introduzca un tiempo en horas");
            h = leer.nextInt();
            if (h <= 0 || h >= 24) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (h <= 1 || h >= 24);
        do {
            System.out.println("Introduzca un tiempo en minutos");
            m = leer.nextInt();
            if (m <= 0 || m >= 60) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (m <= 1 || m >= 60);
        do {
            System.out.println("Introduzca un tiempo en segundos");
            s = leer.nextInt();
            if (s <= 0 || s >= 60) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (s <= 1 || s >= 60);
        System.out.printf("La hora es: %02d:%02d:%02d\n",h,m,s);
        leer.close();
    }
}
