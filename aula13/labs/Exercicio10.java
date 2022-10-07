package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
            final var scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");

        final double celsius = scanner.nextDouble();
        final double farenheit = celsius * 1.8 + 32;

        System.out.println(farenheit);
    }
}
