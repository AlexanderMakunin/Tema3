package com.alexandermakunin.tema03.formatos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final String ESC = "\u001B[";
        final String Exit = ESC + "0m";
        //meter frase y espacio para que el final quede justo sin variar lo largo de la frase
        String EspacioCiudad = "Ciudad: ";
        String fecha = "Fecha: ";
        String hora = "Hora de la mesura: ";
        String VV = "Velocidad viento: ";
        String Temperatura = "Temperatura: ";
        String HPA = "Presión atmosférica: ";
        String PL = "Proabilidad lluvia: ";
        String Uvi = "UVI: ";
        //ciudad
        String ciudad;
        //fecha
        int dia;
        int mes;
        int anyo;
        //hora de medida
        int h;
        int m;
        int s;
        //velocidad del viento
        int VelocidadViento;
        //Temperatura
        float temperatura;
        //Presión atmosférica
        float hPa;
        //% de lluvia
        int lluvia;
        String proabilidad = "%";
        //UVI
        int UVI;
        //introducir la ciudad;
        System.out.println("Introduzca la ciudad");
        ciudad = leer.nextLine();
        //validar la fecha
            System.out.println("Introduzca el año");
            anyo = Integer.parseInt(leer.nextLine());
            do {
                System.out.println("Introduzca el mes");
                mes = Integer.parseInt(leer.nextLine());
                if (mes <= 0 || mes >= 13) {
                    System.err.println("Vuelve a intentarlo");
                }
            } while (mes <= 0 || mes >= 13);
            do {
                System.out.println("Introduzca el dia");
                dia = Integer.parseInt(leer.nextLine());
                if (dia <= 0 || dia >= 32) {
                    System.err.println("Vuelve a intentarlo");
                }
            } while (dia <= 0 || dia >= 32);
        //validar hora de medida
        do {
            System.out.println("Introduzca el tiempo en horas");
            h = Integer.parseInt(leer.nextLine());
            if (h <= 0 || h >= 24) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (h <= 1 || h >= 24);
        do {
            System.out.println("Introduzca el tiempo en minutos");
            m = Integer.parseInt(leer.nextLine());
            if (m <= 0 || m >= 60) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (m <= 1 || m >= 60);
        do {
            System.out.println("Introduzca el tiempo en segundos");
            s = Integer.parseInt(leer.nextLine());
            if (s <= 0 || s >= 60) {
                System.err.println("Vuelve a intentarlo");
            }
        } while (s <= 1 || s >= 60);
        //introducir viento
        System.out.println("Introduzca la velocidad del viento");
        VelocidadViento = Integer.parseInt(leer.nextLine());
        //introducir temperatura
        System.out.println("Introduzca la temperatura");
        temperatura = Float.parseFloat(leer.nextLine());
        //introducir pHa
        System.out.println("Introduzca la presión atmosférica");
        hPa = Float.parseFloat(leer.nextLine());
        //introducir % de lluvia
        System.out.println("Introduzca la % de lluvia");
        lluvia = Integer.parseInt(leer.nextLine());
        //introducir uvi
        System.out.println("Introduzca el índice de radiación ultravioleta");
        UVI = Integer.parseInt(leer.nextLine());
        leer.close();
        //resultado
        System.out.printf(ESC + ";37;44m**DATOS ESTACIÓN METEOROLÓGICA **" + Exit + "\n");
        //ciudad
        System.out.printf("%-24s %s\n",EspacioCiudad,ciudad);
        //fecha
        System.out.printf("%-24s %02d/%02d/%04d\n",fecha,dia,mes,anyo);
        //hora
        System.out.printf("%-24s %02d/%02d/%02d\n",hora,h,m,s);
        //viento
        if (VelocidadViento <= 29){
            System.out.printf("%-24s "+ESC + "32m%d"+ Exit +" Km/h\n"+ Exit,VV,VelocidadViento);
        } else if (VelocidadViento <= 60) {
            System.out.printf("%-24s "+ESC + "33m%d"+ Exit +" Km/h\n"+ Exit,VV,VelocidadViento);
        } else if (VelocidadViento > 60) {
            System.out.printf("%-24s "+ESC + "31m%d"+ Exit +" Km/h\n"+ Exit,VV,VelocidadViento);
        }
        /*
        "\u001B[0;32;m%d Km/h\n"+"\u001B[0m",VelocidadViento, (para yo del futuro) Alex recuerda que puedes poner:
         solo 0-1 n, 30-37 color letra y 40-47 fondo m para que salga el color que quieres
         */
        //temperatura
        if (temperatura<23){
            System.out.printf("%-24s "+ESC + "34m%.02f"+ Exit + " ºC\n",Temperatura,temperatura);
        } else if (temperatura <28) {
            System.out.printf("%-24s "+ESC + "32m%.02f"+ Exit + " ºC\n",Temperatura,temperatura);
        } else if (temperatura<36) {
            System.out.printf("%-24s "+ESC + "33m%.02f"+ Exit + " ºC\n",Temperatura,temperatura);
        } else {
            System.out.printf("%-24s "+ESC + "31m%.02f"+ Exit + " ºC\n",Temperatura,temperatura);
        }
        //pha
        System.out.printf("%-24s %.1f hPa\n",HPA,hPa);
        //lluvia
        if (lluvia>=71) {
            System.out.printf("%-24s "+ESC + "31m%d"+ Exit + " %s\n",PL,lluvia,proabilidad);
        } else if (lluvia <= 70) {
            System.out.printf("%-24s "+ESC + "33m%d"+ Exit + " %s\n",PL,lluvia,proabilidad);
        } else if (lluvia<35){
            System.out.printf("%-24s "+ESC + "32m%d"+ Exit + " %s\n",PL,lluvia,proabilidad);
        }
        //uvi
        if (UVI>10) {
            System.out.printf("%-24s "+ESC + "35m%d"+ Exit + " \n",Uvi,UVI);
        } else if (UVI >= 8) {
            System.out.printf("%-24s "+ESC + "31m%d"+ Exit + " \n",Uvi,UVI);
        } else if (UVI >=6){
            System.out.printf("%-24s "+ESC + "33m%d"+ Exit + " \n",Uvi,UVI);
        } else if (UVI >=3){
            System.out.printf("%-24s "+ESC + "34m%d"+ Exit + " \n",Uvi,UVI);
        } else if (UVI <=2){
            System.out.printf("%-24s "+ESC + "32m%d"+ Exit + " \n",Uvi,UVI);
        }
    }
}