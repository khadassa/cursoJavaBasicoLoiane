package com.loiane.cursojava.aula17.labs;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.next();

        while (nome.length() <= 3) {
            System.out.println("Nome muito pequeno, digite outra vez");
            nome = scanner.next();
        }

        System.out.println("Entre com a idade:");
        int idade = scanner.nextInt();

        while (!(idade >= 0 && idade <= 150)) {
            System.out.println("Idade inválida, digite outra vez");
            idade = scanner.nextInt();
        }

        System.out.println("Informe o salário:");
        double salario = scanner.nextDouble();

        while (salario < 0) {
            System.out.println("Salário inválido, digite outra vez");
            salario = scanner.nextDouble();
        }

        System.out.println("Informe o sexo (F, M, O): ");
        String sexo = scanner.next().toLowerCase(Locale.ROOT);

        while (!(Objects.equals(sexo, "f") || Objects.equals(sexo, "m") || Objects.equals(sexo, "o") )) {
            System.out.println("Sexo inválido, digite outra vez:");
            sexo = scanner.next().toLowerCase(Locale.ROOT);
        }

        System.out.println("Informe o estado civil (s, c, v, d) :");
        String civil = scanner.next().toLowerCase(Locale.ROOT);

        while (!(Objects.equals(civil, "s") || Objects.equals(civil, "c")
                || Objects.equals(civil, "v") || Objects.equals(civil, "d") )) {
            System.out.println("Estado civil inválido, digite outra vez:");
            civil = scanner.next().toLowerCase(Locale.ROOT);
        }










    }
}
