package com.alexandermakunin.tema03.formatos;

public class Ejercicio6 {
    public static void main(String[] args) {
        int i;
        String a = "";
        int cantidad = 9;
        for (i = 1; i <= cantidad; i++) {
            a = a + i;
            System.out.printf("%9s%s\n",a,a);
        }
    }
}