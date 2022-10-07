package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A[" + i + "]");
            vetorA[i] = scanner.nextInt();
            System.out.println("Entre com o valor do vetor B[" + i + "]");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
            System.out.println("Valor de a: " + vetorA[i]);
            System.out.println("Valor de b: " + vetorB[i]);
            System.out.println("Valor de c: " + vetorC[i]);
        }
    }
}
