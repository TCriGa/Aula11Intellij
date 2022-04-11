package br.com.catalisa;
//Crie um algoritmo que leia dois valores (x e y) representando um intervalo.
//Em seguida, leia um novo valor (z) e verifique se z pertence ao intervalo [x, y].

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner intervalo = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        double x = intervalo.nextInt();

        System.out.println("Informe o valor de Y: ");
        double y = intervalo.nextInt();

        System.out.println("Digite o valor de Z: ");
        double z = intervalo.nextInt();

        if (z <= y && z >= x) {

            System.out.println("Z está no intervalo de X e Y ");
        } else {
            System.out.println("Z não está no intervalo de X e Y");
        }
    }
}
