package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Digite F para feminino, M para masculino:");

        String sexo = scanner.next().toUpperCase(Locale.ROOT);



        switch (sexo) {
            case "F":
//            case "f":
                System.out.println("Feminino");
                break;
            case "M":
//            case "m":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
        }



//        if (Objects.equals(sexo, "F")) {
//            System.out.println("Feminino");
//        } else if (Objects.equals(sexo, "M")){
//            System.out.println("Masculino");
//        } else {
//            System.out.println("Sexo inválido");
//        }
//
//        if (sexo.equalsIgnoreCase("f"))


    }
}
