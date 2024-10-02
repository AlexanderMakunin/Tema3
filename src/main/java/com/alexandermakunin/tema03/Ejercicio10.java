package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int anyo;
        System.out.println("Indique un año");
        anyo = leer.nextInt();
        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
            System.out.print("Es bisiesto");
        } else {
            System.out.print("No es bisiesto");
        }
        leer.close();
    }
}
