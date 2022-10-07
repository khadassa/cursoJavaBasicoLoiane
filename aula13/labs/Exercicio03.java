package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira dois numeros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma dos numeros informados foi: " + resultado);
    }
}
