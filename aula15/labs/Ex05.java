package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as duas notas parciais:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double media = nota1 + nota2 / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
