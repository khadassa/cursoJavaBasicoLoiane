package com.loiane.cursojava.aula19.labs;

public class Ex06 {
    public static void main(String[] args) {
        int[] vetorA = new int[]{10, 11, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetorB = new int[]{10, 11, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("Valor de a: " + vetorA[i]);
            System.out.println("Valor de b: " + vetorB[i]);
            System.out.println("Valor de c: " + vetorC[i]);
        }
    }
}
