package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        long anterior = 0L;
        long aux = 1L;
        long atual = 1L;

        while (atual <= 500L) {
            aux = anterior + atual;
            anterior = atual;
            atual = aux;
            System.out.println(atual);
        }
    }
}
