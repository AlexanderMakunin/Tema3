package com.alexandermakunin.tema03.bucles;

public class Ejercicio4 {
    public static void main(String [] args) {
        int producto = 100;
        int x = 1;
        int resultado = 0;
        int impar = 0;
        int par = 0;
        int M5 = 0;
        for (int contador = 1; producto >= contador; contador++) {
            resultado = resultado + x;
            if (resultado % 2 == 0 && resultado % 5 == 0) {
                System.out.println(resultado + " es par y multiplo de 5");
                par++;
                M5++;
            } else if (resultado % 3 == 0 && resultado % 5 == 0) {
                System.out.println(resultado + " es impar y multiplo de 5");
                impar++;
                M5++;
            }
            else if (resultado % 5 == 0) {
                M5++;
                impar++;
                System.out.println(resultado + " es multiplo de 5");
            }
            else if (resultado % 2 == 0) {
                System.out.println(resultado + " es par");
                par++;
            } else {
                System.out.println(resultado + " es impar");
                impar++;
            }
        } System.out.println("Hay " + M5 +  " multiplos de 5");
        System.out.println("Hay " + par + " pares");
        System.out.println("Hay " + impar + " impares");
    }
}
