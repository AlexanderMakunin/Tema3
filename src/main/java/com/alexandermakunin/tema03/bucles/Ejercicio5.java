package com.alexandermakunin.tema03.bucles;

public class Ejercicio5 {
    public static void main(String [] args) {
        int producto = 100;
        int x = 1;
        int resultado = 0;
        int impar = 0;
        int par = 0;
        int M5 = 0;
        int SumaImpar = 0;
        int SumaPar = 0;
        int SumaM5 = 0;
        for (int contador = 1; producto >= contador; contador++) {
            resultado = resultado + x;
            if (resultado % 2 == 0 && resultado % 5 == 0) {
                System.out.println(resultado + " es par y multiplo de 5");
                SumaPar = SumaPar + resultado;
                SumaM5 = SumaM5 + resultado;
                par++;
                M5++;
            } else if (resultado % 2 != 0 && resultado % 5 == 0) {
                System.out.println(resultado + " es impar y multiplo de 5");
                SumaM5 = SumaM5 + resultado;
                SumaImpar = SumaImpar + resultado;
                impar++;
                M5++;
            }
            else if (resultado % 5 == 0) {
                SumaM5 = SumaM5 + resultado;
                SumaImpar = SumaImpar + resultado;
                M5++;
                impar++;
                System.out.println(resultado + " es multiplo de 5");
            }
            else if (resultado % 2 == 0) {
                System.out.println(resultado + " es par");
                SumaPar = SumaPar + resultado;
                par++;
            } else {
                System.out.println(resultado + " es impar");
                SumaImpar = SumaImpar + resultado;
                impar++;
            }
        } System.out.println("Hay " + M5 +  " multiplos de 5 y el total de su suma es: " + SumaM5);
        System.out.println("Hay " + par + " pares y el total de su suma es: " + SumaPar);
        System.out.println("Hay " + impar + " impares y el total de su suma es: " + SumaImpar);
    }
}
