package com.loiane.cursojava.aula15.labs;

import javax.crypto.spec.PSource;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de carne desejada (file - fd /alcatra - a /picanha - p):");
        String carne = scanner.next().toLowerCase(Locale.ROOT);

        System.out.println("Informe a quantidade kg:");
        double qntdd = scanner.nextDouble();

        System.out.println("Pagamento no cartao: 1- sim");
        int pagamento = scanner.nextInt();

        double precoKg;
        double precoTotal;
        double desconto;

        if (Objects.equals(carne, "fd")) {

            System.out.println(qntdd + "Kg - Filé Duplo");

            if (qntdd <= 5) {
                precoKg = 4.9;

            } else {
                precoKg = 5.8;
            }
            precoTotal = precoKg * qntdd;

            if (pagamento == 1) {
                desconto = precoTotal * 0.05;
                double valorFinal = precoTotal - desconto;
                System.out.println("Valor final: R$" + valorFinal);

            } else {
                System.out.println("Preço total: R$" + precoTotal);
            }

        } else if (Objects.equals(carne, "a")) {

            System.out.println(qntdd + "Kg - Alcatra");

            if (qntdd <= 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
            precoTotal = precoKg * qntdd;

            if (pagamento == 1) {
                desconto = precoTotal * 0.05;
                double valorFinal = precoTotal - desconto;
                System.out.println("Valor final: R$" + valorFinal);

            } else {
                System.out.println("Preço total: R$" + precoTotal);
            }

        } else if (Objects.equals(carne, "p")) {

            System.out.println(qntdd + "Kg - Picanha");

            if (qntdd <= 5) {
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
            precoTotal = precoKg * qntdd;

            if (pagamento == 1) {
                desconto = precoTotal * 0.05;
                double valorFinal = precoTotal - desconto;
                System.out.println("Valor final: R$" + valorFinal);

            } else {
                System.out.println("Preço total: R$" + precoTotal);
            }
        }

















    }
}
