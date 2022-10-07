package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex03 {

    public static final String MATRIZ_FORMAT = "[%d][%d]: %d"; //Cria uma constante para usar na formatação da String

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var size = 3;
        int[][] numeros = new int[size][size];
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Entre com um número da posição: [" + i + "," + j + "]");
                numeros[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final var format = String.format(MATRIZ_FORMAT, i, j, numeros[i][j]);
                System.out.println(format);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                final var elementoAtual = numeros[i][j];
                if (elementoAtual % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
            }
        }
        System.out.println("Quantidade de números pares: " + contPares);
        System.out.println("Quantidade de números impares: " + contImpares);
    }
}
