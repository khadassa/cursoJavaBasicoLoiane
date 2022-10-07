package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.println("Informe o preço do pão:");
        double precoPao = scanner.nextDouble();
        int qntdd = 50;
        double total = 0;

        System.out.println("Preço do pão: " + precoPao);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= qntdd; i++) {
            total = precoPao * i;
            System.out.println(i + " - " + "R$" + total);
        }
    }
}
