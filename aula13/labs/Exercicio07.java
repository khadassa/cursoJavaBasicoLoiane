package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Insira as medidas do lado e altura:");

        final double lado1 = scanner.nextDouble();
        final double lado2 = scanner.nextDouble();

        final double dobroArea = (lado1 * lado2)*2;
        System.out.println("O dobro da area é: " + dobroArea);

    }
}
