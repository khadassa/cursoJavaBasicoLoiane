package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro:");

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
