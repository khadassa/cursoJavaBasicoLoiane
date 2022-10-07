package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        System.out.println("Digite 3 números diferentes:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();


        if ((num1 > num2 && num1 > num3) && (num2 > num3)) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if ((num1 > num2 && num1 > num3) && (num3 > num2)) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if ((num2 > num1 && num2 > num3) && (num1 > num3)) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if ((num2 > num1 && num2 > num3) && (num3 > num1)) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if ((num3 > num1 && num3 > num2) && (num1 > num2)) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else {
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }
}

