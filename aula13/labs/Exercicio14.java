package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo e a velocidade:");

        final double tamanhoArquivo = scanner.nextDouble();
        final double velocidade = scanner.nextDouble();

        final double tempoDownload = tamanhoArquivo / velocidade;

        System.out.println("Tempo para download: " + tempoDownload);

    }
}
