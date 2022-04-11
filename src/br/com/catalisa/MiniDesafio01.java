package br.com.catalisa;

/*Nesse desafio você terá que desenvolver uma calculadora que vai:

● receber 2 números;
● exibir um menu de operações matemáticas;
● realizar calculo matemático e exibir o resultado
● opção de sair do programa*/

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MiniDesafio01 {
    public static void main(String[] args) {
        menu();

    }

    public static void menu() {

        Scanner caculator = new Scanner(System.in);

        System.out.println("Informe dois números: ");
        double n1 = caculator.nextDouble();
        double n2 = caculator.nextDouble();

        double resultado = 0;

        while (true) {
            System.out.println("Digite a opção desejada:");

            System.out.print("|-----------------------------------------------------|\n");
            System.out.print("| Opção 1 - Adição (+)                                |\n");
            System.out.print("| Opção 2 - Subtração (-)                             |\n");
            System.out.print("| Opção 3 - Multiplicação (*)                         |\n");
            System.out.print("| Opção 4 - Divisão (/)                               |\n");
            System.out.print("| Opcão 5 - Porcentagem (%)                           |\n");
            System.out.print("| Opção 6 - Sair                                      |\n");
            System.out.print("|-----------------------------------------------------|\n");
            System.out.print("Digite uma opção desejada:");

            int opcao = caculator.nextInt();

            if (opcao == 1) {
                resultado = (n1 + n2);
                System.out.println("O valor do resultado é = " + resultado);
            }

            else if (opcao == 2) {
                resultado = ( n1 - n2);
                System.out.println("O valor do resultado é = " + resultado);
            }

            else if (opcao == 3) {
                resultado = (n1 * n2);
                System.out.println("O valor do resultado é = " + resultado);
            }
            else if (opcao == 4) {
                resultado = (n1 / n2);
                System.out.println("O valor do resultado é = " + resultado);
            }
            else if (opcao == 5){
                resultado = (n1 * (n2/100));
                System.out.println("O valor do resultado é = " + resultado);
            }
            else if (opcao == 6) {
                System.exit(0);
            }


        }


    }

}
