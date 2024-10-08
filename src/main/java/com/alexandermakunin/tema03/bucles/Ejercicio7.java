package com.alexandermakunin.tema03.bucles;

public class Ejercicio7 {
    public static void main(String[] args) {
        int a = 4;
        int b = -5;
        int c = 1;
        if (b > 0){
        for (int x = 1; x <=b; x++) {
            c = a * c;

        }
        }else {
            for (int x = -1; x >=b; x--) {
                c = a * c;

            }
        }System.out.println("El resultado es: " + c);
    }
}
