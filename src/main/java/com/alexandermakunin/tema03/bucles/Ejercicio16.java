package com.alexandermakunin.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int PorrasPlayer = 0;
        int ManoPlayer = 0;
        int PorrasIa = 0;
        int ManoIa = 0;
        int ronda = 0;
        int dado;
        final String JUGAR = "Jugar";
        final String PASAR = "Pasar";
        Random random = new Random();
        System.out.println("Empiza el juego");
        do {
            if (PorrasPlayer >= 5 || PorrasIa >= 5) {
                break;
            }
            ronda++;
            ManoPlayer = 0;
            ManoIa = 0;
            dado = random.nextInt(1, 7);
            ManoPlayer = ManoPlayer + dado;
            System.out.println("Empieza la ronda numero: " + ronda);
            System.out.println("Tienes esta cantidad de porras: " + PorrasPlayer);
            System.out.println("El ordenador tiene esta cantidad de porras: " + PorrasIa);
            System.out.println("Tienes esta cantidad de puntos: " + ManoPlayer);
            System.out.println("Que quieres hacer?");
            String accion = leer.nextLine();
            switch (accion) {
                case JUGAR: {
                    while (ManoPlayer <= 11) {
                        dado = random.nextInt(1, 7);
                        ManoPlayer = ManoPlayer + dado;
                        System.out.println("Sacaste: " + dado);
                        System.out.println("Tienes actualmente: " + ManoPlayer + " puntos");
                        if (ManoPlayer > 11) {
                            System.err.println("Perdiste la ronda, el ordenador consiguio: " + ManoIa);
                            PorrasIa = PorrasIa + 1;
                            break;
                        } else if (ManoPlayer == 11) {
                            System.out.println("Puntuaje perfecto");
                            PorrasPlayer = PorrasPlayer + 2;
                            break;
                        } else {
                            System.out.println("Que quieres pasar?");
                            accion = leer.nextLine();
                            if (accion.equals("Si")) {
                                break;
                            }
                        }
                    }
                }
                case PASAR: {
                    do {
                        dado = random.nextInt(1, 7);
                        ManoIa = ManoIa + dado;
                        if (ManoIa > 11) {
                            System.out.println("Ganaste la ronda, tiene ordenador: " + ManoIa + " puntos");
                            PorrasPlayer = PorrasPlayer + 1;
                        } else if (ManoIa == 11) {
                            System.err.println("El ordenador gano la ronda, saco puntuaje perfecto");
                            PorrasIa = PorrasIa + 2;
                        } else if (ManoIa > ManoPlayer && ManoIa <= 11) {
                            System.err.println("El ordenador gano la ronda, tiene: " + ManoIa + " puntos");
                            PorrasIa = PorrasIa + 1;
                        }
                    } while (ManoIa <= ManoPlayer && ManoIa <= 11);
                }
                default: {
                    //existir
                }
            }
        } while (PorrasPlayer <= 5 || PorrasIa <= 5);
        leer.close();
        if (ManoPlayer <= 5) {
            System.out.println("Ganaste, obtuviste: " + PorrasPlayer + " porras");
        } else {
            System.err.println("Perdiste, el ordenador obtuvo: " + PorrasIa + " porras");
        }
    }
}