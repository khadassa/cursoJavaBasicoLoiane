package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a medida em metros:");
        double metros = scanner.nextDouble();
        double conversor = metros * 100;

        System.out.println("A medida em centimetros é: " + conversor + "cm");
    }
}
