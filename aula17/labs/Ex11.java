package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número");
        int num2 = scanner.nextInt();

        int soma = 0;

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                soma += i;
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                soma += i;
            }
        }
        System.out.println("A soma dos números é: " + soma);

        /*if (num1 < num2) {
            while (num1 < num2) {

                num1++;
                System.out.println(num1);

                soma += num1;
            }
        } else {
            while (num2 < num1) {
                num2++;
                System.out.println(num2);

                soma += num2;
            }
        }*/
    }
}
