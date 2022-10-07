package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite o valor de 3 produtos:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 < num2 && num1 < num3){
            System.out.println("Você deve comprar o produto de R$" + num1);
        } else if (num2 < num1 && num2 < num3){
            System.out.println("Você deve comprar o produto de R$" + num2);
        } else {
            System.out.println("Você deve comprar o produto de R$" + num3);
        }
    }
}
