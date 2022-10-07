package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex17Fatorial {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int num = scanner.nextInt();
        int atual = 0;
        int fatorial = 1;
        int anterior = fatorial;

       /* for (int i = 1; i < num; i++) {
            fatorial = num - i;
            atual =  anterior * fatorial;
            anterior = atual;
        }
        System.out.println(atual);*/

        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.print(i + ".");
        }
        System.out.println("Resultado: " + fatorial);
    }
}
