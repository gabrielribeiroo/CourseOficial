/*
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
package course.Exercicios1.Sequencial;

import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o Codigo da peça, quantidade e valor unitario (mesma linha): ");
        int codPeca = leitor.nextInt();
        int quantidade = leitor.nextInt();
        double valorUnitario = leitor.nextDouble();
        System.out.println("Digite o Codigo da peça, quantidade e valor unitario (mesma linha): ");
        int codPeca2 = leitor.nextInt();
        int quantidade2 = leitor.nextInt();
        double valorUnitario2 = leitor.nextDouble();
        
        double ValorTotal = (quantidade*valorUnitario)+(quantidade2*valorUnitario2);
        
        System.out.printf("VALOR A PAGAR: %.2f%n", ValorTotal);
    }
    
}
