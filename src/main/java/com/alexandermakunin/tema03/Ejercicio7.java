package com.alexandermakunin.tema03;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float cuota = 500;
        int edad;
        float paga;
        String socio = "S";
        System.out.println("Indique un numero");
        edad = leer.nextInt();
        if (edad >= 65) {
            paga = cuota * 50 / 100;
            paga = cuota - paga;
            System.out.print("Tiene que pagar " + paga);
        } else if (edad <= 18) {
            System.out.println("Sus padres son socios? Responda con S afirmativo o N para negativo");
            socio = leer.next();
            if (socio.equals("S")) {
                paga = cuota * 35 / 100;
                paga = cuota - paga;
                System.out.print("Tiene que pagar " + paga);
            } else {
                paga = cuota * 25 / 100;
                paga = cuota - paga;
                System.out.print("Tiene que pagar " + paga);
            }
        } else {
            System.out.print("Tiene que pagar " + cuota);
        } leer.close();
    }
}