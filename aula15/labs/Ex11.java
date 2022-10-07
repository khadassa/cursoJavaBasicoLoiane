package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite seu salário:");

        double salario = scanner.nextDouble();

        double percentual; //inicia a variavel antes do if sem valor e dps determina o valor no if

        if (salario <= 280) {

            percentual = 0.2;

        } else if (salario > 280 && salario <= 700) {
            percentual = 0.15;

        } else if (salario > 700 && salario <= 1500) {
           percentual = 0.1;

        } else {
            percentual = 0.05;
        }

        double aumento = salario * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("Salario antes do ajuste: R$" + salario);
        System.out.println("Percentual de aumento: " + percentual * 100 + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo salário: R$" + salarioAjustado);

        /*
        if (salario <= 280) {

            double aumento = salario * 0.2;
            double ajuste = salario + aumento;

            System.out.println("Salario antes do ajuste: R$" + salario);
            System.out.println("Percentual de aumento: 20%");
            System.out.println("Valor do aumento: R$" + aumento);
            System.out.println("Novo salário: R$" + ajuste);

        } else if (salario > 280 && salario <= 700) {
            double aumento = salario * 0.15;
            double ajuste = salario + aumento;

            System.out.println("Salario antes do ajuste: R$" + salario);
            System.out.println("Percentual de aumento: 15%");
            System.out.println("Valor do aumento: R$" + aumento);
            System.out.println("Novo salário: R$" + ajuste);

        } else if (salario > 700 && salario <= 1500) {
            double aumento = salario * 0.1;
            double ajuste = salario + aumento;

            System.out.println("Salario antes do ajuste: R$" + salario);
            System.out.println("Percentual de aumento: 10%");
            System.out.println("Valor do aumento: R$" + aumento);
            System.out.println("Novo salário: R$" + ajuste);

        } else {
            double aumento = salario * 0.05;
            double ajuste = salario + aumento;

            System.out.println("Salario antes do ajuste: R$" + salario);
            System.out.println("Percentual de aumento: 0,5%");
            System.out.println("Valor do aumento: R$" + aumento);
            System.out.println("Novo salário: R$" + ajuste);
        }

         */


    }
}
