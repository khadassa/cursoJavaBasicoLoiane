package com.loiane.cursojava.aula13.labs;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Insira o quanto ganha por hora e a quantidade de horas trabalhadas " +
                "por mês:");
        final double salario = scanner.nextDouble();
        final double horasTrabalhadas = scanner.nextDouble();

        final double salarioTotal = salario * horasTrabalhadas;

        System.out.println("Seu salario esse mês é: " + salarioTotal);
    }
}
