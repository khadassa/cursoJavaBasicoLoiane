package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre uma nota de 0 a 10:");
        int nota = scanner.nextInt();

       while (!(nota >= 0 && nota <= 10)) {
           System.out.println("informe um valor válido");
           nota = scanner.nextInt();
       }



    }
}
