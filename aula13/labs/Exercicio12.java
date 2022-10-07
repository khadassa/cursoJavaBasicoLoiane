package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Insira a altura:");

        final double altura = scanner.nextDouble();
        final double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
