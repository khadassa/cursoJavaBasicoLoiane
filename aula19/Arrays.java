package com.loiane.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {
        double [] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34.1;
        temperaturas[4] = 33.2;

        System.out.println("Temperatura dia 1: " + temperaturas[0]);
        System.out.println("Tamanho do array: " + temperaturas.length);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura no dia " + (i+1) + " : " + temperaturas[i]);
        }

        System.out.println("Outra forma:");

        for (double temp : temperaturas) {
            System.out.println(temp);
        }

    }

}
