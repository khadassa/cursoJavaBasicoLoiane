package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as 4 notas bimestrais:");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble()   ;
        double numero3 = scanner.nextDouble();
        double numero4 = scanner.nextDouble();

        double somaNotas = numero1 + numero2 + numero3 + numero4;
        double resultado = somaNotas/4;

        System.out.println("Sua média foi: " + resultado);
    }

}
