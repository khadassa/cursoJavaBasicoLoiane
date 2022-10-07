package com.loiane.cursojava.aula16;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 0;
        int max = 10;

        while (i < max) {
            i++;
            System.out.println("Valor de i: " + i);
        }
        System.out.println(i);

        do {
            i++;
            System.out.println("Valor de i: " + i);
        }
        while (i < 12);

        System.out.println(i);
    }
}
