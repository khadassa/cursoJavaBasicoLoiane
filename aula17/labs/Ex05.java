package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex05 {
    public static double calcularCrescimento(double populacao, double taxa) {
        return populacao + (populacao * (taxa/100));
    }

    private static int calcularAnos(double populacaoA, double taxaA, double populacaoB, double taxaB) {
        int anos = 0;

        while (populacaoB >= populacaoA) {
            populacaoA = calcularCrescimento(populacaoA, taxaA);
            populacaoB = calcularCrescimento(populacaoB, taxaB);
            anos ++;
        }
        return anos;
    }

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe a população inicial de A:");
        double populacaoA = scanner.nextDouble();

        System.out.println("Informe a taxa de crescimento inicial de A:");
        final double taxaA = scanner.nextDouble();

        System.out.println("Informe a população inicial de B:");
        double populacaoB = scanner.nextDouble();

        System.out.println("Informe a taxa de crescimento inicial de B:");
        final double taxaB = scanner.nextDouble();

        int anos = calcularAnos(populacaoA, taxaA, populacaoB, taxaB);

        System.out.println("A população A será igual ou maior em: " + anos + " anos");
    }
}
