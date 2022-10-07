package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }



//        while (num2 < num1) {
//            System.out.println("O número 1 deve ser menor que o número dois");
//
//            System.out.println("Informe o primeiro número");
//            num1 = scanner.nextInt();
//            System.out.println("Informe o segundo número");
//            num2 = scanner.nextInt();
//        }
//
//        for (int i = num1; i <= num2; i++) {
//            System.out.println(i);
//        }




    }
}
