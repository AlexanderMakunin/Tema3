package com.alexandermakunin.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float numero;
        float resultado = 0;
        do{
            System.out.println("Introduzca un numero para ir sumandolo, pulse 0 para sumar todo");
            numero = leer.nextFloat();
            resultado = resultado + numero;
        }
        while (numero > 0);{
        } System.out.println(resultado);
        leer.close();
    }
}