package br.com.catalisa;

/*Nesse desafio você terá que desenvolver um programa que leia um valor e
apresente o número de Fibonacci correspondente a este valor lido.
Lembre-se que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e
cada próximo termo é a soma dos 2 anteriores a ele. No final imprima a
mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de Fibonacci.*/

import java.util.Scanner;

public class MiniDesafio02 {

    public static void main(String[] args) {

        Scanner fibo = new Scanner(System.in);

        System.out.println("Informe um número");
        int n = fibo.nextInt();

        int nFibo = logicaFibo(n);

        System.out.println("Fib(n) = " + nFibo);
    }

    public static int logicaFibo(int num){

        int num1 = 1;
        int num2 = 0;

        for (int i = 1; i < num; i++) {

            num1 = num1 + num2;
            num2 = num1 - num2;

        }


        return num2;
    }

}




