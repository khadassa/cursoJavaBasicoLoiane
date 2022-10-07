package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        String[][] jogoDaVelha = new String[3][3];

        boolean rodarJogo = true;
        while (rodarJogo){

            System.out.println("Informe a coluna desejada (0, 1, 2)");
            int coluna = scanner.nextInt();
            System.out.println("Informe a linha desejada (0, 1, 2)");
            int linha = scanner.nextInt();
            System.out.println("Marcar com X ou O?");
            jogoDaVelha[coluna][linha] = scanner.next();

            System.out.println(jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]);
            System.out.println(jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]);
            System.out.println(jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]);
        }
    }
}
