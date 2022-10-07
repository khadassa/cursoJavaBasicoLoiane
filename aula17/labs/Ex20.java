package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Deseja entrar com a idade?");
        boolean calcular = scanner.nextBoolean();

        int cont = 1;
        double soma = 0;
        double media = 0;

        while (calcular) {
            System.out.println("Entre com a idade:");
            double idade = scanner.nextDouble();

            cont++;
            soma += idade;
            media = soma / cont;

            System.out.println("Deseja continuar calculando?");
            calcular = scanner.nextBoolean();
        }

        if (media >= 0 && media <= 25) {
            System.out.println("Turma jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("Turma adulta");
        } else {
            System.out.println("Turma idosa");
        }
        System.out.println("Média final: " + media);
        System.out.println("programa encerrado");
    }
}
