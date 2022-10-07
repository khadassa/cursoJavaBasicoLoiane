package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex28NumPrimo {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        int num = scanner.nextInt();
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo _ Divisivel por: " + i);
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Número primo");
        }
    }
}
