package com.loiane.cursojava.aula15.labs;

import java.util.Objects;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.println("Entre com dois numeros inteiros:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Qual operação deseja realizar?");
        System.out.println("1- soma; 2- subtração; 3 - divisão; 4 - multiplicação"  );

         int operacao = scanner.nextInt();
         double resultado;

         if (operacao == 1) {
             resultado = num1 + num2;

             System.out.println("Resultado: " + resultado);

             if (resultado % 2 == 0) {
                 System.out.println("Par");
             } else {
                 System.out.println("Impar");
             }
             if (resultado > 0) {
                 System.out.println("Positivo");
             } else {
                 System.out.println("Negativo");
             }

         } else if (operacao == 2) {
             resultado = num1 - num2;

             System.out.println("Resultado: " + resultado);

             if (resultado % 2 == 0) {
                 System.out.println("Par");
             } else {
                 System.out.println("Impar");
             }
             if (resultado > 0) {
                 System.out.println("Positivo");
             } else {
                 System.out.println("Negativo");
             }

         } else if (operacao == 3) {
             resultado = num1 / num2;

             System.out.println("Resultado: " + resultado);

             if (resultado % 2 == 0) {
                 System.out.println("Par");
             } else {
                 System.out.println("Impar");
             }
             if (resultado > 0) {
                 System.out.println("Positivo");
             } else {
                 System.out.println("Negativo");
             }

         } else if (operacao == 4) {
             resultado = num1 * num2;

             System.out.println("Resultado: " + resultado);

             if (resultado % 2 == 0) {
                 System.out.println("Par");
             } else {
                 System.out.println("Impar");
             }
             if (resultado > 0) {
                 System.out.println("Positivo");
             } else {
                 System.out.println("Negativo");
             }
         }









        /*
        switch (operacao){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 / num2;
                break;
            case 4:
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida");
        }

         */













    }
}
