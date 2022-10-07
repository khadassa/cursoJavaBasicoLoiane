package com.loiane.cursojava.aula12;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Nome completo: " + nomeCompleto);

        System.out.println("Digite seu nome: ");
        String primeiroNome = scan.next();
        System.out.println("Primeiro nome: " + primeiroNome);


        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Altura: " + altura);

         */

        System.out.println("Digite seu primeiro nome, idade, altura, quantidade de filhos e se tem pet:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        float altura = scan.nextFloat();
        byte filhos = scan.nextByte();
        boolean pets = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Quantidade de filhos: " + filhos);
        System.out.println("Tem pets? " + pets);


    }
}
