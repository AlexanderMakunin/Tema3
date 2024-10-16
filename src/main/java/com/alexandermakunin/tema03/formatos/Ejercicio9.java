package com.alexandermakunin.tema03.formatos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final String ESC = "\u001B[";
        final String Exit = ESC + "0m";

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
        /*
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

        int VelocidadViento;
        System.out.println("Introduzca la velocidad del viento");
        VelocidadViento = Integer.parseInt(leer.nextLine());
        if (VelocidadViento <= 29){
            System.out.printf(ESC + "32m%d"+ Exit +" Km/h\n"+ Exit,VelocidadViento);
        } else if (VelocidadViento <= 60) {
            System.out.printf(ESC + "33m%d"+ Exit +" Km/h\n"+ Exit,VelocidadViento);
        } else if (VelocidadViento > 60) {
            System.out.printf(ESC + "31m%d"+ Exit +" Km/h\n"+ Exit,VelocidadViento);
        }  //"\u001B[0;32;m%d Km/h\n"+"\u001B[0m",VelocidadViento, Alex recuerda que puedes poner solo x+m para que salga el color que quieres
        //Temperatura
        float temperatura;
        System.out.println("Introduzca la temperatura");
        temperatura = Float.parseFloat(leer.nextLine());
        if (temperatura<23){
            System.out.printf(ESC + "34m%.02f"+ Exit + " ºC\n",temperatura);
        } else if (temperatura <28) {
            System.out.printf(ESC + "32m%.02f"+ Exit + " ºC\n",temperatura);
        } else if (temperatura<36) {
            System.out.printf(ESC + "33m%.02f"+ Exit + " ºC\n",temperatura);
        } else {
            System.out.printf(ESC + "31m%.02f"+ Exit + " ºC\n",temperatura);
        }
        //Presión atmosférica
        float hPa;
        System.out.println("Introduzca la presión atmosférica");
        hPa = Float.parseFloat(leer.nextLine());
        System.out.printf("%.1f hPa\n",hPa);
        //% de lluvia
        int lluvia;
        String proabilidad = "%";
        System.out.println("Introduzca la % de lluvia");
        lluvia = Integer.parseInt(leer.nextLine());
        if (lluvia>=71) {
            System.out.printf(ESC + "31m%d"+ Exit + " %s\n",lluvia,proabilidad);
        } else if (lluvia <= 70) {
            System.out.printf(ESC + "33m%d"+ Exit + " %s\n",lluvia,proabilidad);
        } else if (lluvia<35){
            System.out.printf(ESC + "32m%d"+ Exit + " %s\n",lluvia,proabilidad);
        }
        //UVI


        int UVI;
        System.out.println("Introduzca el índice de radiación ultravioleta");
        UVI = Integer.parseInt(leer.nextLine());
        if (UVI>10) {
            System.out.printf(ESC + "35m%d"+ Exit + " \n",UVI);
        } else if (UVI >= 8) {
            System.out.printf(ESC + "31m%d"+ Exit + " \n",UVI);
        } else if (UVI >=6){
            System.out.printf(ESC + "33m%d"+ Exit + "\n",UVI);
        } else if (UVI >=3){
            System.out.printf(ESC + "34m%d"+ Exit + "\n",UVI);
        } else if (UVI <=2){
            System.out.printf(ESC + "32m%d"+ Exit + "\n",UVI);
        }
        leer.close();

         */
        System.out.printf(ESC + ";37;44m**DATOS ESTACIÓN METEOROLÓGICA **" + Exit + "\n");
        System.out.printf("Ciudad: %24s\n", ciudad);
        System.out.printf("Fecha: %02d/%02d/%04d",dia,mes,anyo);
    }
}
