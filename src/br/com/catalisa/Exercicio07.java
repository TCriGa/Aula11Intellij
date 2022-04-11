package br.com.catalisa;

import java.util.Scanner;

/*Escreva um algoritmo que leia 20 números do usuário e exiba
quantos números são maiores do que 8.*/
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner maiores8 = new Scanner(System.in);

        int n[] = new int[20];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Informe um número: ");
            n[i] = maiores8.nextInt();
        }
        int qtddn = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 8) {
                System.out.println("São números maiores que 8 = " + n[i]);
                qtddn++;
            }

        }
        System.out.println("Quantidade de númeors maiores que 8 é = " + qtddn);


    }

}
