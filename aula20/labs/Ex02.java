package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Ex02 {
    public static final String MATRIZ_FMT = "[%d][%d]: %d";

    public static void main(String[] args) {
        final int[][] matrizM = new int[10][10];
        Random numeroRandomico = new Random();

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = numeroRandomico.nextInt(100);
            }
        }
        for (int i = 0; i < matrizM.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        int maior = 0;
        int menor = matrizM[0][0];

        //loop na linha 5
        for (int i = 0; i < matrizM[5].length; i++) {
            final var elementoAtual = matrizM[5][i];
            if (elementoAtual > maior) {
                maior = elementoAtual;
            }
            if (elementoAtual < menor) {
                menor = elementoAtual;
            }
        }
        System.out.println("Maior elemento da linha 5: " + maior);
        System.out.println("Menor elemento da linha 5: " + menor);

        //loop na coluna 7
        for (int i = 0; i < 10; i++) {
            final var elementoAtual = matrizM[i][7];
            if (elementoAtual > maior) {
                maior = elementoAtual;
            }
            if (elementoAtual < menor) {
                menor = elementoAtual;
            }
        }
        System.out.println("Maior elemento da coluna 7: " + maior);
        System.out.println("Menor elemento da coluna 7: " + menor);
    }
}
