package com.alexandermakunin.tema03.bucles;

import java.util.Random;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int intentos;
        Random random = new Random();
        int aleatorio = random.nextInt(1,100);
        System.out.println("Una cantidad de intentos");
        intentos = leer.nextInt();
        do{
            System.out.println("Introduzca un numero entre 1 al 100");
            numero = leer.nextInt();
            if (numero == aleatorio) {
                System.out.println("Ganaste");
            } else if (numero > aleatorio) {
                intentos--;
                System.out.println(numero + " es mayor que el numero aleatorio");
            } else if (numero < aleatorio) {
                System.out.println(numero + " es menor que el numero aleatorio");
                intentos--;
            }  if (intentos == 0) {
                System.out.println("Perdiste");
                break;
            }
        }
        while (numero != aleatorio);{
        }
        leer.close();
    }
}