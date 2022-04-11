package br.com.catalisa;

/*Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e
informe o nome do dia correspondente*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner semana = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7");
        int n = semana.nextInt();

        if (n == 1) {
            System.out.println("É segunda-feira");

        } else if (n == 2) {
            System.out.println("É terça-feira");
        } else if (n == 3) {
            System.out.println("É quarta- feira");
        } else if (n == 4) {
            System.out.println("É quinta-feira");
        } else if (n == 5) {
            System.out.println(" É sexta-feira");

        }else if (n == 6) {
            System.out.println("É sábado");
        }
        else if (n == 7) {
            System.out.println("É domingo");

        }

    }
}


