package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Insira o valor ganho por hora e o numero de horas trabalhadas por mês:");

        final double salarioHora = scanner.nextDouble();
        final double horasTrabalhadas = scanner.nextDouble();

        final double salarioBruto = salarioHora * horasTrabalhadas;
        System.out.println("Salario Bruto: " + salarioBruto);

        final double inss = salarioBruto * 0.08;
        System.out.println("Desconto do INSS: " + inss);

        final double sindicato = salarioBruto * 0.05;
        System.out.println("Desconto do Sindicato: " + sindicato);

        final double impostoRenda = salarioBruto * 0.11;
        System.out.println("Desconto do imposto de renda: " + impostoRenda);

        final double totalDescontos = inss + sindicato + impostoRenda;
        System.out.println("Total de descontos: " + totalDescontos);

        final double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}
