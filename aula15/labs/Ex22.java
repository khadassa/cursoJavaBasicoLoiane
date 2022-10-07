package com.loiane.cursojava.aula15.labs;

import java.util.Objects;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade em Kg de Morango: ");
        double qntddMorango = scanner.nextDouble();

        System.out.println("Entre com a quantidade em Kg de Maça: ");
        double qntddMaca = scanner.nextDouble();

        double precoMorango;
        double precoMaca;

        if (qntddMorango <= 5) {
            precoMorango = 2.5;
        } else {
            precoMorango = 2.2;
        }

        if (qntddMaca <= 5){
            precoMaca = 1.8;
        } else {
            precoMaca = 1.5;
        }

        double precoTotalMorango = precoMorango * qntddMorango;
        double precoTotalMaca = precoMaca * qntddMaca;
        double precoTotalFrutas = precoTotalMorango + precoTotalMaca;
        double qntddTotalFrutas = qntddMaca + qntddMorango;

        if (qntddTotalFrutas > 8 || precoTotalFrutas > 25) {
            double desconto = precoTotalFrutas - (precoTotalFrutas * 0.1);

            System.out.println("Valor total com desconto: " + desconto);

        } else {
            System.out.println("Valor total da compra: " + precoTotalFrutas);
        }
    }
}