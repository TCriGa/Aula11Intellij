package br.com.catalisa;

import java.util.Scanner;

/*Escreva um algoritmo que leia 20 números do usuário e exiba
quantos números são pares*/
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);

        int n[] = new int[20];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            n[i] = par.nextInt();
        }

        int qtddPar = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] %2 == 0){
                System.out.println("Número pares = " + n[i]);
                qtddPar++;
            }
        }
        System.out.println("Quantidade de par é = " + qtddPar);

    }
}
