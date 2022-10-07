package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Entre com as 3 medidas do triangulo:");

        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado3 + lado2 > lado1) {
            System.out.println("Forma triangulo");
        } else {
            System.out.println("Não forma triangulo: Medidas inválidas");
        }

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Triangulo equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triangulo Isósceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }
    }
}
