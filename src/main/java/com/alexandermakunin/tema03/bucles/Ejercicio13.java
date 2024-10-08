package com.alexandermakunin.tema03.bucles;

import java.util.Random;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        float cara = 0;
        float cruz = 0;
        for (int x = 1; x<1001; x++){
            int aleatorio = random.nextInt(2);
            if (aleatorio == 1){
                cara++;
            }else {
                cruz++;
            }
        }
        float ResultadoCara = cara * 100 / 1000;
        float ResultadoCruz = cruz * 100 / 1000;
        System.out.println("El % de caras es: "+ResultadoCara+"%");
        System.out.println("El % de cruz es: "+ResultadoCruz+"%");
        leer.close();
    }
}