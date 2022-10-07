package com.loiane.cursojava.aula17.labs;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        String rodarprograma;
        double valor = 1;
        double total = 0;
        int qntdd = 0;
        String output = "Lojas tabajara \n";
        System.out.println(output);

        System.out.println("Deseja informar nova compra? sim/nao");
        rodarprograma = scanner.next().toLowerCase(Locale.ROOT);

        while (Objects.equals(rodarprograma, "sim")) {

            System.out.println("Informe a quantidade de produtos");
            qntdd = scanner.nextInt();

            for (int i = 1; i <= qntdd; i++) {
                System.out.println("Informe o valor do produto " + i);
                valor = scanner.nextDouble();
                output += "Produto " + i + ": R$" + valor + "\n";
                total += valor;
            }
            output += "Total: R$" + total + "\n";
            System.out.println("Total: R$" + total);

            System.out.println("Informe o valor em dinheiro:");
            double pagamento = scanner.nextDouble();
            output += "Dinheiro: R$" + pagamento + "\n";

            double troco = pagamento - total;
            output += "Troco: R$" + troco + "\n";
            System.out.println(output);
            System.out.println("...");

            System.out.println("Deseja informar nova compra? sim/nao");
            rodarprograma = scanner.next().toLowerCase(Locale.ROOT);
        }
    }
}
