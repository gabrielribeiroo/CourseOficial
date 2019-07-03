/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
package course.exercicio2.condicional;

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
        System.out.println("Digite um número: ");
        int n = leitor.nextInt();

        if (n == 0) {
            System.out.println("ZERO");
        } else if (n > 0) {
            System.out.println("NÃO NEGATIVO");

        } else {
            System.out.println("NEGATIVO");   
        }
    }

}
