package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][24];
        boolean rodarPrograma = true;
        int opcao;

        while (rodarPrograma) {
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            opcao = scanner.nextInt();

            boolean diaValido = false;
            int dia = 0;
            boolean horaValida = false;
            int hora = 0;
            boolean mesValido = false;
            int mes = 0;

            if (opcao == 1) {
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scanner.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                while (!horaValida) {
                    System.out.println("Entre com a hora do dia");
                    hora = scanner.nextInt();
                    if (hora >= 0 && hora < 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                    System.out.println("Entre com o compromisso do dia " + dia + "/" + mes +", " + hora + "h");
                    dia--;
                    mes--;
                    compromissos[mes][dia][hora] = scanner.next();
                }
            } else if (opcao == 2) {
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scanner.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                while (!horaValida) {
                    System.out.println("Entre com a hora do dia");
                    hora = scanner.nextInt();
                    if (hora >= 0 && hora < 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                    dia--;
                    mes--;
                    System.out.println("Compromisso do dia " + (dia+1) + "/" + (mes+1) + ", " + hora + "h: "
                            + compromissos[mes][dia][hora]);
                }

            } else if (opcao == 0) {
                rodarPrograma = false;
            } else {
                System.out.println("Número inválido, digite novamente");
            }
        }
    }
}
