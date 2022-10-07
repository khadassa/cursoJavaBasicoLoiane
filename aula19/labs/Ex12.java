package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A[" + i + "]");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nSoma dos elementos: " + soma);
    }
}
