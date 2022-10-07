package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.println("Responda as perguntas com 0 - não; 1 - sim:");

        System.out.println("Telefonou para a vítima?");
        int resp1 = scanner.nextInt();

        System.out.println("Esteve no local do crime?");
        int resp2 = scanner.nextInt();

        System.out.println("Mora perto da vítima?");
        int resp3 = scanner.nextInt();

        System.out.println("Devia para a vítima?");
        int resp4 = scanner.nextInt();

        System.out.println("Já trabalhou com a vítima?");
        int resp5 = scanner.nextInt();

        int classificacao = resp1 + resp2 + resp3 + resp4 + resp5;

        if (classificacao == 2) {
            System.out.println("Suspeita");
        } else if (classificacao >= 3 && classificacao <= 4) {
            System.out.println("Cúmplice");
        } else if (classificacao >= 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
    }
}
