package com.alexandermakunin.tema03.formatos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final String ESC = "\u001B[";
        final String Exit = ESC + "0m";
        /*
        //ciudad
        String ciudad;
        //introducir la ciudad;
        System.out.println("Introduzca el año");
        ciudad = leer.nextLine();
        System.out.println(ciudad);
        //fecha
        int dia;
        int mes;
        int anyo;
        //validar la fecha
        System.out.println("Introduzca el año");
        anyo = leer.nextInt();
        do {
            System.out.println("Introduzca el mes");
            mes = leer.nextInt();
            if (mes <= 0 || mes >= 13) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (mes <= 0 || mes >= 13);
        do {
            System.out.println("Introduzca el dia");
            dia = leer.nextInt();
            if (dia <= 0 || dia >= 32) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (dia <= 0 || dia >= 32);
        System.out.printf("La fecha es: %02d:%02d:%04d\n",dia,mes,anyo);
        //hora de medida
        int h;
        int m;
        int s;
        //validar hora de medida
        do {
            System.out.println("Introduzca un tiempo en horas");
            h = leer.nextInt();
            if (h <= 0 || h >= 24) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (h <= 1 || h >= 24);
        do {
            System.out.println("Introduzca un tiempo en minutos");
            m = leer.nextInt();
            if (m <= 0 || m >= 60) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (m <= 1 || m >= 60);
        do {
            System.out.println("Introduzca un tiempo en segundos");
            s = leer.nextInt();
            if (s <= 0 || s >= 60) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (s <= 1 || s >= 60);
        System.out.printf("La hora es: %02d:%02d:%02d\n",h,m,s);
        //velocidad del viento
        */
        int VelocidadViento;
        System.out.println("Introduzca la velocidad del viento");
        VelocidadViento = Integer.parseInt(leer.nextLine());
        if (VelocidadViento <= 30){
            System.out.printf(ESC + "32m%d Km/h\n"+ Exit,VelocidadViento);
        } //"\u001B[0;32;m%d Km/h\n"+"\u001B[0m",VelocidadViento, Alex recuerda que puedes poner solo x+m para que salga el color que quieres
        System.out.printf("%d Km/h",VelocidadViento);
        //Temperatura
        float temperatura;
        System.out.println("Introduzca la temperatura");
        temperatura = Float.parseFloat(leer.nextLine());
        System.out.printf("%f ºC",temperatura);
        //Presión atmosférica
        float hPa;
        System.out.println("Introduzca la presión atmosférica");
        hPa = Float.parseFloat(leer.nextLine());
        System.out.printf("%f ºhPa",hPa);
        //% de lluvia
        int lluvia;
        System.out.println("Introduzca la % de lluvia");
        lluvia = Integer.parseInt(leer.nextLine());
        System.out.println(lluvia+"%");
        //UVI
        int UVI;
        System.out.println("Introduzca el índice de radiación ultravioleta");
        UVI = Integer.parseInt(leer.nextLine());
        System.out.println(UVI);
        leer.close();
    }
}
