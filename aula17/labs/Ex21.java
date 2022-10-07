package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade de turmas:");
        int turmas = scanner.nextInt();
        int alunos = 0;
        int total = 0;

        for (int i = 0; i < turmas; i++) {
            System.out.println("Entre com a quantidade de alunos da turma:" + (i + 1));
            alunos = scanner.nextInt();
            if (alunos > 40) {
                System.out.println("Numero inválido, a turma deve ter menos de 40 alunos");
                alunos = scanner.nextInt();
            }
            total += alunos;
        }
        int media = total / turmas;
        System.out.println("A média de alunos por turma é: " + media);

    }
}
