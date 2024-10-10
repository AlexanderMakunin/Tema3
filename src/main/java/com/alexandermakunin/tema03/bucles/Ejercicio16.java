package com.alexandermakunin.tema03.bucles;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int PorrasPlayer = 0;
        int ManoPlayer;
        int PorrasIA = 0;
        int ManoIa;
        Random random = new Random();
        int aleatorio = random.nextInt(1,7);
        System.out.println("Que quieres hacer?");
        do{
            if (ManoPlayer == 11) {
                System.out.println("Perfecto");
                PorrasPlayer++;
                PorrasPlayer++;
            } else if (11 > PorrasPlayer && PorrasPlayer < PorrasIA) {
                PorrasPlayer++;
                System.out.println("Ganaste la ronda");
            } else if (11 < PorrasPlayer) {
                System.out.println("Perdiste la ronda");
                PorrasIA++;
            }  if (PorrasIA >= 5) {
                System.out.println("Perdiste");
                break;
            }
        }
        while (PorrasPlayer < 5);{
        }
        leer.close();
    }
}