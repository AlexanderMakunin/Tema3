package com.alexandermakunin.tema03.formatos;

public class Ejercicio7 {
    public static void main(String[] args) {
        int i;
        String a = "";
        /*int cantidad = 9;
        for (i = 1; i <= cantidad; i++) {
            for (;i <= cantidad;i++) {
                a = a + i;
                b = i + b;
                System.out.printf("%9s%-9s\n",a,b);
            }
        }*/
        int cantidad = 9;
        for (i = 1; i <= cantidad; i++) {
            a = a + i;
            System.out.printf("%9s",a);
            for (int b = (a.length()-1); b >=0; b--) {
                System.out.print(a.charAt(b));
            }
            System.out.println();
        }
    }
}
