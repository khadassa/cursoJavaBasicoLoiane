package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor de a: " + vetorA[i]);
            System.out.println("Valor de b: " + vetorB[i]);
        }
    }
}
