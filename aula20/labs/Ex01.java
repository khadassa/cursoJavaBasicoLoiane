package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Ex01 {

    public static final String MATRIZ_FMT = "[%d][%d]: %d";

    public static void main(String[] args) {
        final int[][] numerosAleatorios = new int[4][4];
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                final var elementoAtual = numerosAleatorios[i][j];
                if (elementoAtual > maior) {
                    maior = elementoAtual;
                    linha = i;
                    coluna = j;
                }
            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                //System.out.printf("[%d][%d]: %d\n", i, j, matrizM[i][j]);
                final var format = String.format(MATRIZ_FMT, i, j, numerosAleatorios[i][j]);
                System.out.println(format);
            }
        }
        System.out.println("Maior valor:");
        System.out.println("[" + linha + "]" + "[" + coluna + "]: " + maior);

    }
}
