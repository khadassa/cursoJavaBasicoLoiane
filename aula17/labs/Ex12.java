package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe o numero");
        int num = scanner.nextInt();

        System.out.println("Tabuada de " + num);

        for ( int i = 0; i <= 10; i++) {
            int tabuada = num * i;
            System.out.println(num + "x" + i + " = " + tabuada);
        }
    }
}
