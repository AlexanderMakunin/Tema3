package com.alexandermakunin.tema03.formatos;

public class Ejercicio7 {
    public static void main(String[] args) {
        int i;
        String a = "";
        String b = "";
        int cantidad = 9;
        for (i = 1; i <= cantidad; i++) {
            for (;i <= cantidad;i++) {
                a = a + i;
                b = i + b;
                System.out.printf("%9s%-9s\n",a,b);
            }
        }
    }
}
