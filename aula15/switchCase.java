package com.loiane.cursojava.aula15;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 - 7");

        int weekDay = scanner.nextInt();
        //String weekDay = scanner.next();

        /*
        if (weekDay == 1){
            System.out.println("Domingo");
        } else if (weekDay == 2) {
            System.out.println("Segunda-feira");
        } else if (weekDay == 3) {
            System.out.println("Terça-feira");
        } else if (weekDay == 4) {
            System.out.println("Quarta-feira");
        } else if (weekDay == 5) {
            System.out.println("Quinta-feira");
        } else if (weekDay == 6) {
            System.out.println("Sexta-feira");
        } else if (weekDay == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Entre um número válido");
        }

         */

        /*
        switch (weekDay){
            case 1: System.out.println("Domingo");
                break;
            case 2: System.out.println("Segunda-feira");
                break;
            case 3: System.out.println("Terça-feira");
                break;
            case 4: System.out.println("Quarta-feira");
                break;
            case 5: System.out.println("Quinta-feira");
                break;
            case 6: System.out.println("Sexta-feira");
                break;
            case 7: System.out.println("Sábado");
                break;
            default: System.out.println("Entre um número válido");
        }

         */

        switch (weekDay){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil");
                break;
            case 1:
            case 7: System.out.println("Final de semana");
                break;
            default: System.out.println("Entre um número válido");
        }
    }
}
