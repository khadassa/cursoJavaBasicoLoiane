package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex15Fibonacci {
    public static void main(String[] args) {
        System.out.println("Digite o intervalo desejado");
        final var scanner = new Scanner(System.in);
        final long n = scanner.nextLong();
        long aux;
        long anterior = 0L;
        long atual = 1L;

        for (int i = 1; i < n; i++) {
            aux = anterior + atual;
            anterior = atual;
            atual = aux;
            System.out.println(atual);
        }
    }
}
