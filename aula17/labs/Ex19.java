package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Deseja calcular a média?");
        boolean calcular = scanner.nextBoolean();

        int cont = 1;
        double soma = 0;
        double media = 0;

        while (calcular) {
            System.out.println("Entre com a nota:");
            double nota = scanner.nextDouble();

            cont++;
            soma += nota;
            media = soma / cont;

            System.out.println("Deseja continuar calculando?");
            calcular = scanner.nextBoolean();
        }
        System.out.println("Média final: " + media);
        System.out.println("programa encerrado");

    }
}
