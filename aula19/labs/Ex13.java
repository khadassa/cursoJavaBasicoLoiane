package com.loiane.cursojava.aula19.labs;

public class Ex13 {
    public static void main(String[] args) {
        int[] vetorA = new int[]{10, 24, 35, 46, 53, 64, 72, 83, 99, 15};
        int soma = 0;

        for (int a : vetorA) {
            if (a % 5 == 0) {
                soma += a;
            }
        }
        System.out.println("\nSoma multiplos de 5: " + soma);
    }
}
