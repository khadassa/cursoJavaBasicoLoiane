package com.loiane.cursojava.aula17.labs;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe o nome do usuário:");
        String nome = scanner.next().toLowerCase(Locale.ROOT);

        System.out.println("Informe a senha:");
        String senha = scanner.next().toLowerCase(Locale.ROOT);

        while (Objects.equals(nome, senha)) {
            System.out.println("Senha inválida, digite outra vez");
            senha = scanner.next();
        }
    }
}
