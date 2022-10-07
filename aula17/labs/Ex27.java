package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        double temperatura = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        double soma = 0;

        System.out.println("Entre com a quantidade de temperaturas desejada");
        int qntdd = scanner.nextInt();

        for (int i = 1; i <= qntdd; i++) {
            System.out.println("Informe a temperatura " + i);
            temperatura = scanner.nextDouble();

            soma += temperatura;

            if (temperatura > maior) {
                maior = temperatura;
            } else if (temperatura < menor) {
                menor = temperatura;
            }
        }
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);

        double media = soma / qntdd;
        System.out.println("A media das temperaturas informadas é: " + media);
    }
}
