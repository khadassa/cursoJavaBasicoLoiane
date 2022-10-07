package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Exercicio06 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        final var scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo:");

        final double raio = scanner.nextDouble();
        //double area = raio * raio * 3.14;

        final double area = Math.pow(raio,2) * PI;

        System.out.println("A área é:" + area);

    }
}
