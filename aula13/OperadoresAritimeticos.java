package com.loiane.cursojava.aula13;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int resultado = 1+2;
        System.out.println(resultado);

        resultado = resultado -1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        resultado ++;
        System.out.println(resultado);

        resultado +=1;
        System.out.println(resultado);

        System.out.println(resultado++);

        System.out.println(++resultado);

        resultado --;
        System.out.println(resultado);

        System.out.println(-- resultado);

        String primeiraFrase = "Esta é ";
        String segundaFrase = "uma string concatenada";
        String terceiraFrase = primeiraFrase + segundaFrase;
        System.out.println(terceiraFrase);
    }
}
