/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */
package course.exercicio4.For;

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
        System.out.println("Digite o Valor: ");
        int num = leitor.nextInt();

        for (int i = 0; i <= num; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }

}
