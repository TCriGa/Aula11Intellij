package br.com.catalisa;

import java.util.Scanner;

//Crie um algoritimo que leia dois valores (x e y) e informe se eles são iguais

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner lerXY = new Scanner(System.in);

        System.out.println("Digite o valor de x");
        double x = lerXY.nextDouble();

        System.out.println("Digite o valor de y");
        double y = lerXY.nextDouble();

        if (x == y) {
            System.out.println("X e Y são Iguais ");
        }
        else if (x != y) {
            System.out.println("X e Y são diferentes");
        }

    }
}
