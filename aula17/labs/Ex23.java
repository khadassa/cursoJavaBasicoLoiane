package com.loiane.cursojava.aula17.labs;



public class Ex23 {
    public static void main(String[] args) {
        int total = 50;
        double valor = 1.99;
        double tabela = 0;

        System.out.println("Loja Quase Dois - Tabela de preços");
        for (int i = 1; i <= total; i++) {
            tabela = valor * i;
            System.out.println(i + " - " + "R$" + tabela);
        }
    }
}
