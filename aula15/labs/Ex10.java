package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite o turno M - Matutino; V - Vespertino; N - Noturno:");

        String turno = scanner.next().toUpperCase(Locale.ROOT);

        switch (turno) {
            case "M":
                System.out.println("Bom dia");
                break;
            case "V":
                System.out.println("Boa tarde");
                break;
            case "N":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Turno inválido");
        }

//        if (Objects.equals(turno,"M")) {
//            System.out.println("Bom dia");
//        } else if (Objects.equals(turno, "V")) {
//            System.out.println("Boa tarde");
//        } else if (Objects.equals(turno, "N")){
//            System.out.println("Boa noite");
//        } else {
//            System.out.println("Turno inválido");
//        }



    }
}
