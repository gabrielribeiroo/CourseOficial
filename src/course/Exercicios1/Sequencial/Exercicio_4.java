/*
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */
package course.Exercicios1.Sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o seu Codigo de Funcionario: ");
        int codFunc = leitor.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        int numHoras = leitor.nextInt();
        System.out.println("Digite o salario por hora: ");
        double salHora = leitor.nextDouble();
        double calc = numHoras * salHora;
        System.out.println("NUMBER = " + codFunc);
        System.out.printf("SALARY = U$ %.2f%n", calc);
    }
    
}
