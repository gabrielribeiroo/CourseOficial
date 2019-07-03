/*
 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
 */
package course.Exercicios1.Sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o valor do Raio: ");
        double raio = leitor.nextDouble();
        double pi = 3.14159;
        
        double calc = pi * (raio * raio);
        
        System.out.printf("A=%.4f%n", calc );
        
    }
    
}
