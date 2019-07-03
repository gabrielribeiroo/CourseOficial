/*
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
package course.Exercicios1.Sequencial;

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
        System.out.println("Digite o Valor A:");
        int A = leitor.nextInt();
        System.out.println("Digite o Valor B:");
        int B = leitor.nextInt();
        System.out.println("Digite o Valor C:");
        int C = leitor.nextInt();
        System.out.println("Digite o Valor D:");
        int D = leitor.nextInt();
        
        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = " + diferenca);
    }

}
