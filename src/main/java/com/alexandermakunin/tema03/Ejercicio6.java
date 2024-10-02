package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Euros;
        int restos;
        int Euro2;
        int Euro1;
        int Monedas50;
        int Monedas20;
        int Monedas10;
        int Monedas5;
        int Monedas2;
        int Monedas1;

        System.out.println("Indique cuantos Euros tiene");
        Euros = leer.nextInt();
        Euros = Euros * 100;

        Euro2 = Euros / 200;
        restos = Euros % 200;

        Euro1 = restos / 100;
        restos = restos % 100;

        Monedas50 = restos / 50;
        restos = restos % 50;

        Monedas20 = restos / 20;
        restos = restos % 20;

        Monedas10 = restos / 10;
        restos = restos % 10;

        Monedas5 = restos / 5;
        restos = restos % 5;

        Monedas2 = restos / 2;
        restos = restos % 2;

        Monedas1 = restos;
        leer.close();

        System.out.println("Su cantidad de Euros de monedas son Euros de 2: " + Euro2 + "," + " Euros de 1: " + Euro1 + "," + " centimos de 50: " + Monedas50 + "," + " centimos de 20: " + Monedas20 + "," + " centimos de 10: " + Monedas10 + "," + " centimos de 5: " + Monedas5 + "," + " centimos de 2: " + Monedas2 + "," + " centimos de 1: " + Monedas1);
    }
}