package com.alexandermakunin.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float numero;
        float resultado = 0;
        float contador = 0;
        do{
            System.out.println("Introduzca un numero para ir contandolo, pulse un negativo para sacar la media de todo");
            numero = leer.nextFloat();
            if (numero < 0) {
                contador = resultado / contador;
            } else {
                resultado = resultado + numero;
                contador++;
            }
        }
        while (numero > -1);{

        }System.out.println(contador);
        leer.close();
    }
}