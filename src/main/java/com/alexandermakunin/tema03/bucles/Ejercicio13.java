package com.alexandermakunin.tema03.bucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        float cara = 0;
        float cruz = 0;
        for (int x = 1; x<1000001; x++){
            int aleatorio = random.nextInt(1,3);
            if (aleatorio == 1){
                cara++;
            }else if (aleatorio == 2) {
                cruz++;
            }
        }
        float ResultadoCara = cara * 100 / 1000000;
        float ResultadoCruz = cruz * 100 / 1000000;
        System.out.println("El % de caras es: "+ResultadoCara+"%");
        System.out.println("El % de cruz es: "+ResultadoCruz+"%");
    }
}