package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int[] vetorA = new int[8];
        int [] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i]*2;
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Array a índice " + i + " : " + vetorA[i]);
            System.out.println("Array b índice " + i + " : " + vetorB[i]);
        }


    }
}
