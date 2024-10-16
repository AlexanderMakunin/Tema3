package com.alexandermakunin.tema03.formatos;

public class Ejercicio5 {
    public static void main(String[] args) {
        int i;
        String a = "";
        int cantidad = 9;
        int color = 29;
        for (i = 1; i <= cantidad; i++) {
            a = a + i;
            if (color >= 37)
            {
                color = 30;
            } else{
                color = color + 1;
            }
            System.out.printf("\u001B[0;"+color+"m%9s\n"+"\u001B[0m",a);
        }
    }
}