package br.com.catalisa;

import java.util.Scanner;

//Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o resultado da multiplicação de x por y.
public class Exercicio04 {
    public static void main(String[] args) {

        Scanner multiplicacaoXy = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        double x = multiplicacaoXy.nextDouble();

        System.out.println("Informe o valor de Y: ");
        double y = multiplicacaoXy.nextDouble();

        double multiplicacao = (x * y);

        System.out.println("O resultado da multiplicação de x = " + x +" e y = " + y + " é = " + multiplicacao);

    }
}
