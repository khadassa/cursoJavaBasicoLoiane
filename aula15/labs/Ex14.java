package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com duas notas parciais:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito;
        String aprovacao;

        if (media >= 9 && media <= 10) {
            conceito = "A";
            aprovacao = "Aprovado";

        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            aprovacao = "Aprovado";

        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            aprovacao = "Aprovado";

        } else if (media >= 4 && media < 6) {
            conceito = "D";
            aprovacao = "Reprovado";

        } else {
            conceito = "E";
            aprovacao = "Reprovado";
        }

        System.out.println("Nota 1:" + nota1);
        System.out.println("Nota 2:" + nota2);
        System.out.println(media);
        System.out.println("Conceito: " + conceito);
        System.out.println(aprovacao);
    }
}
