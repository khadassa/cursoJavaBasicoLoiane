package com.loiane.cursojava.aula17.labs;

public class Ex04 {
    public static double calcularCrescimento(double populacao, double taxa) {
        return populacao + (populacao * taxa);
    }
    public static void main(String[] args) {

        double populacaoA = 80_000;
        final double taxaA = 0.03;

        double populacaoB = 200_000;
        final double taxaB = 0.015;

        int anos = calcularAnos(populacaoA, taxaA, populacaoB, taxaB);

        System.out.println(anos);
        
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
}
