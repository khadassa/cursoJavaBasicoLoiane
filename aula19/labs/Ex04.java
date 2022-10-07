package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        DecimalFormat df= new DecimalFormat("###,###.###");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A[" + i + "]");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valor de a" + (i) + " = " + vetorA[i]);
            System.out.println("Valor de b" + (i) + " = " + df.format(vetorB[i]));
        }

    }
}
