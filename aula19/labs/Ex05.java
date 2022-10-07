package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A[" + i + "]");
            vetorA[i] = scanner.nextInt();

        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * i;
            System.out.println("Valor de a: " + vetorA[i]);
            System.out.println("Valor de b: " + vetorB[i]);
        }
    }
}
