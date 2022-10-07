package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade de CDs:");
        int qntddCDs = scanner.nextInt();
        double valorCD = 0;
        double valorTotal = 0;

        for (int i = 1; i <= qntddCDs; i++) {
            System.out.println("Informe o valor pago no CD" + i);
            valorCD = scanner.nextDouble();
            valorTotal += valorCD;
        }

        double mediaValorCD = valorTotal / qntddCDs;

        System.out.println("O valor médio gasto em cada CD foi: R$" + mediaValorCD);
    }
}
