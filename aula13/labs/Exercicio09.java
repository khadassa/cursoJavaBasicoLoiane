package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Farenheit:");

        final double farenheit = scanner.nextDouble();
        final double celsius = 5 * (farenheit - 32) / 9;

        System.out.println("A temperatura em Celsius é: " + celsius + "°C");
    }
}
