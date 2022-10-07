package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        System.out.println("Insira o valor ganho por hora e o numero de horas trabalhadas por mês:");

        double salarioHora = scanner.nextDouble();
        double horasTrabalhadas = scanner.nextDouble();

        final double salarioBruto = salarioHora * horasTrabalhadas;

        double percentualIR;

        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 0.05;

        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
             percentualIR = 0.1;

        } else {
            percentualIR = 0.2;
        }

        double descontoIR = salarioBruto * percentualIR;
//            double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double inss = salarioBruto * 0.1;
        double descontos = descontoIR + inss;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salario Bruto:" + "(" + salarioHora + " * " + horasTrabalhadas + "): R$" + salarioBruto);
        System.out.println("IR (" + percentualIR * 100 + ") R$" + descontoIR);
        System.out.println("INSS (10%): R$" + inss);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total Descontos: R$" + descontos);
        System.out.println("Salário Liquido: R$" + salarioLiquido);


        /*
        if (salarioBruto <= 900) {
            double ir = salarioBruto * 0;
//            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.1;
            double descontos = ir + inss;
            double salarioLiquido = salarioBruto - descontos;

            System.out.println("IR: R$" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("FGTS: R$" + fgts);
            System.out.println("Total Descontos: R$" + descontos);
            System.out.println("Salário Liquido: R$" + salarioLiquido);

        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            double ir = salarioBruto * 0.05;
//            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.1;
            double descontos = ir + inss;
            double salarioLiquido = salarioBruto - descontos;

            System.out.println("IR: R$" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("FGTS: R$" + fgts);
            System.out.println("Total Descontos: R$" + descontos);
            System.out.println("Salário Liquido: R$" + salarioLiquido);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            double ir = salarioBruto * 0.1;
//            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.1;
            double descontos = ir + inss;
            double salarioLiquido = salarioBruto - descontos;

            System.out.println("IR: R$" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("FGTS: R$" + fgts);
            System.out.println("Total Descontos: R$" + descontos);
            System.out.println("Salário Liquido: R$" + salarioLiquido);
        } else {
            double ir = salarioBruto * 0.2;
//            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.1;
            double descontos = ir + inss;
            double salarioLiquido = salarioBruto - descontos;

            System.out.println("IR: R$" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("FGTS: R$" + fgts);
            System.out.println("Total Descontos: R$" + descontos);
            System.out.println("Salário Liquido: R$" + salarioLiquido);
        }

         */
    }
}
