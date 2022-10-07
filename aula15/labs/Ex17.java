package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }
    }
}
