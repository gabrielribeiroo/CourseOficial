/*
 Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */
package course.Exercicios1.Sequencial;

import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro valor a ser somado: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo valor a ser somado: ");
        int n2 = leitor.nextInt();
        
        int calc = n1 + n2;
        
        System.out.println("SOMA = " + calc);
    }

}
