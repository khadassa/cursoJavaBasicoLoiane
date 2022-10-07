package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.println("Entre com um numero");
        int num = scanner.nextInt();
        System.out.println("Entre com um limite");
        int max = scanner.nextInt();

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                System.out.println("Número divisivel por 7: " + i);
                break;
            }
        }

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                continue; // não vai imprimir os divisiveis por 7
            }
            System.out.println(i);
        }
    }
}

