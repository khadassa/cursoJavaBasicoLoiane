package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com a idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();

        if (valor <= 10) {
            System.out.println("Item barato, comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pedir desconto");
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro!");
        }
    }
}
