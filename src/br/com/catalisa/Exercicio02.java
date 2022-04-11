package br.com.catalisa;

import java.util.Scanner;

//Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner reajusteSalario = new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        double salario = reajusteSalario.nextDouble();



        double salariototal = (salario * 0.07) + salario;
        System.out.println("O salário com reajuste é = " + salariototal);
    }

}
