package com.loiane.cursojava.aula19.labs;

public class Ex10 {
    public static void main(String[] args) {
        int[] vetorA = new int[]{11, 25, 37, 49, 53, 61, 77, 83, 99, 10};
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] % 2;
            System.out.println(vetorB[i]);
        }
    }
}

