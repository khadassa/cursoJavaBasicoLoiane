package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:");

        String letra = scanner.next().toLowerCase(Locale.ROOT);

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");
            }
        }


    }
}
