package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int[] vetorA = new int[]{11, 24, 37, 46, 53, 64, 72, 83, 99, 10};
        int qtdPares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A[" + i + "]");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0)
                qtdPares++;
            System.out.println("Quantidade de elementos pares: " + qtdPares);
        }
    }
}
