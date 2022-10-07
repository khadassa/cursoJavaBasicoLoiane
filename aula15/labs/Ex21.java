package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite qual combustivel:");
        System.out.println("A - Álcool; G - Gasolina");

        String combustivel = scanner.next().toLowerCase(Locale.ROOT);

        System.out.println("Abastecer quantos litros?");
        int litros = scanner.nextInt();

        double preco;
        double desconto;
        double total;

        if (Objects.equals(combustivel, "a")) {
            preco = litros * 1.9;

            if (litros <= 20){
                desconto = preco * 0.03;

            } else {
                desconto = preco * 0.05;
            }

            total = preco - desconto;
            System.out.println("Valor pago: " + total);

        } else if (Objects.equals(combustivel, "g")) {
            preco = litros * 2.5;

            if (litros <= 20) {
                desconto = preco * 0.04;

            } else {
                desconto = preco * 0.06;

            }
            total = preco - desconto;
            System.out.println("Valor pago: " + total);

        } else {
            System.out.println("Entre com um combustivel válido");
        }
    }
}
