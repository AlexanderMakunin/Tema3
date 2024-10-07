package com.alexandermakunin.tema03.bucles;

public class Ejercicio4 {
    public static void main(String [] args) {
        int producto = 100;
        int x = 1;
        int resultado = 0;
        int contador = 1;
        int impar = 0;
        for (contador = 1; producto >= contador; contador++) {
            resultado = resultado + x;
            if (resultado % 2 == 0) {
            } else {
                impar = impar + 1;
                System.out.println(resultado);
            }

            }System.out.println("Hay un total de: " + impar);
        }

    }
