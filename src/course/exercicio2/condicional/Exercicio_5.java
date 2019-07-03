/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
1 cachorro quente 4
2 x-salada 4.50
3 x-bacon 5
4 torrada simples 2
5 refrigerante 1.50
 */
package course.exercicio2.condicional;

import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o codigo do Produto: ");
        int cod1 = leitor.nextInt();
        System.out.println("Digite a Quantidade:");
        int qtd1 = leitor.nextInt();

        double total = 0.0;
        if (cod1 == 1) {
            total = qtd1 * 4.00;
        } else if (cod1 == 2) {
            total = qtd1 * 4.50;
        } else if (cod1 == 3) {
            total = qtd1 * 5.00;
        } else if (cod1 == 4) {
            total = qtd1 * 2.00;
        } else if (cod1 == 5) {
            total = qtd1 * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);
    }

}
