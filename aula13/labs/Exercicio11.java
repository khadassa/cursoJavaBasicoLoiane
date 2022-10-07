package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        System.out.println("Insira dois numeros inteiros e um numero real:");

        final int num01 = scanner.nextInt();
        final int num02 = scanner.nextInt();
        final double num03 = scanner.nextDouble();

        final int resultado01 = (num01 * 2) + (num02 / 2);
        System.out.println(resultado01);

        final double resultado02 = (num01 * 3) + num03;
        System.out.println(resultado02);

        final double resultado03 = Math.pow(num03, 3);
        System.out.println(resultado03);


    }
}
