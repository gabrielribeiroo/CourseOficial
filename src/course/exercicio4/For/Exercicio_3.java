/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
package course.exercicio4.For;

import java.util.Locale;
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
        System.out.println("Digite a quantidade de repetiçoes: ");
        int qtd = leitor.nextInt();
        double calc = 0;
        int peso = 2;
        for (int i = 0; i < qtd; i++) {
            for (int j = 0; j < 3; j++) {

                calc += valores(peso);

                if (peso == 2 || peso == 3 || peso == 4 && peso < 5) {
                    peso++;
                    if (peso == 4) {
                        peso++;
                    }
                }
            }
            System.out.printf("Media Ponderada: %.1f%n", calc / 10);
            calc = 0;
            peso = 2;
        }

    }

    static double valores(int peso) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = leitor.nextDouble();
        double calc = peso * valor;
        return calc;
    }

}
