package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Insira um numero positivo ou negativo:");

        double num = scanner.nextDouble();

        if (num >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
