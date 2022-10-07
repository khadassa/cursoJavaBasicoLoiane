package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex26Fatorial {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int num = scanner.nextInt();
        int fatorial = 1;

        System.out.println("Fatorial de: " + num);
        System.out.print(num + "! = ");

        for (int i = num; i > 1; i--) {
            fatorial = fatorial * i;
            System.out.print(i + ".");
        }
        System.out.print("1 = " + fatorial);
    }
}
