package com.alexandermakunin.tema03.formatos;

public class Ejercicio8 {
    public static void main(String[] args) {
        //aun no tiene nada
        final String ESC = "\u001B[";
        final String Exit = ESC + "0m";
        int negrita = 0;
        int color = 30;
        int fondo = 40;
        do {
            do {
                System.out.printf(ESC + negrita + ";" + color + ";" + fondo + "m %d;%d;%d" + Exit, negrita, color, fondo);
                fondo++;
            } while (fondo < 48);
            System.out.println();
            if (fondo == 47 || negrita < 2){
                fondo = fondo - 8;
                color++;
                if (color == 38){
                    color = color - 6;
                    negrita++;
                }
            }
        }while(negrita <= 1 && color <= 37 && fondo <=47);
    }
}