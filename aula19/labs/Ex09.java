package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;

public class Ex09 {
    public static void main(String[] args) {
        double[] vetorA = new double[]{10, 20, 4, 40, 50, 60, 70, 80, 90, 10};
        double[] vetorB = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] vetorC = new double[10];
        DecimalFormat df = new DecimalFormat("###,###.###");

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
            System.out.println("Valor de a: " + vetorA[i]);
            System.out.println("Valor de b: " + vetorB[i]);
            System.out.println("Valor de c: " + df.format(vetorC[i]));
        }
    }
}
