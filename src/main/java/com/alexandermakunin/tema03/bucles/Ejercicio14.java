package com.alexandermakunin.tema03.bucles;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float num4 = 0;
        float num5 = 0;
        float num6 = 0;
        for (int x = 1; x<1001; x++){
            int aleatorio = random.nextInt(1,7);
            if (aleatorio == 1){
                num1++;
            }else if (aleatorio == 2) {
                num2++;
            }
            else if (aleatorio == 3) {
                num3++;
            }else if (aleatorio == 4) {
                num4++;
            }else if (aleatorio == 5) {
                num5++;
            }else if (aleatorio == 6) {
                num6++;
            }
        }
         num1 = num1 * 100 / 1000;
         num2 = num2 * 100 / 1000;
         num3 = num3 * 100 / 1000;
         num4 = num4 * 100 / 1000;
         num5 = num5 * 100 / 1000;
         num6 = num6 * 100 / 1000;
        System.out.println("El % de num1 es: "+num1+"%");
        System.out.println("El % de num2 es: "+num2+"%");
        System.out.println("El % de num3 es: "+num3+"%");
        System.out.println("El % de num4 es: "+num4+"%");
        System.out.println("El % de num5 es: "+num5+"%");
        System.out.println("El % de num6 es: "+num6+"%");
        leer.close();
    }
}