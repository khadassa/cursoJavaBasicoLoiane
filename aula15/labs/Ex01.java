package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite dois números diferentes:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        //System.out.println(Math.max(num1, num2));

        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
