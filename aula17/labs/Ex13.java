package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com a base: ");
        int base = scanner.nextInt();
        System.out.println("Entre com potencia: ");
        int potencia = scanner.nextInt();

        int resultado = base;

        for (int i = 1; i < potencia; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado à " + potencia + " = " + resultado);
    }
}
