package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com um número inteiro:");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                contPares++;

            } else {
                contImpares++;
            }
        }

        System.out.println(contPares + " Números pares");
        System.out.println(contImpares + " Números impares");

    }
}
