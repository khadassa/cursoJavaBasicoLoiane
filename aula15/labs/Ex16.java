package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a");
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("valor inválido, programa encerrado");
        } else {
            System.out.println("Digite o valor de b");
            int b = scanner.nextInt();
            System.out.println("Digite o valor de c");
            int c = scanner.nextInt();

            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Delta negativo, programa encerrado");
            } else {
                System.out.println("Delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta))/ (2 * a);

                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }
        }
    }
}
