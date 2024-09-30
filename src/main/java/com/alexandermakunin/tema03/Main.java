package com.alexandermakunin.tema03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un numero: ");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println("Hello world!");
        int x = i++;
        int y = ++i;
    }
}