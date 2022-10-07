package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            num = scanner.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou: " + maior);
            }
        }

        System.out.println("O maior número é :" + maior);





    }
}
