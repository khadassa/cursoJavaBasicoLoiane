package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29NumPrimo {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }

    }

}
