/*
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
package course.exercicio2.condicional;

import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Valor de A: ");
        int a = leitor.nextInt();
        System.out.println("Digite o Valor de B: ");
        int b = leitor.nextInt();

        if (a > b) {
            if (a % b == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        } else if (a < b) {
            if (b % a == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        }

    }

}
