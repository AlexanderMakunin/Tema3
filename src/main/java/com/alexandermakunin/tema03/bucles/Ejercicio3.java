package com.alexandermakunin.tema03.bucles;

public class Ejercicio3 {
    public static void main(String [] args) {
        int y = 4;
        int x = 6;
        int resultado = 0;
        if (y > 0) {
            for (int contador = 0; y > contador; contador++) {
                resultado = resultado + x;
            }

        } else if (x > 0) {
            for (int contador = 0; x > contador; contador++) {
                resultado = resultado + y;
            }
        }else {
            for (int contador = 0; x < contador; --contador){
                resultado = resultado - y;
            }
        }System.out.println("La suma es " + resultado);
    }
}