package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        int num;
        int soma = 0;
        int media;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            num = scanner.nextInt();

            soma += num;
        }

        media = soma/5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A media dos números é: " + media);
    }
}
