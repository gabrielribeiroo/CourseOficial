/*
 Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */
package course.exercicio2.condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do Eixo X: ");
        double x = leitor.nextDouble();
        System.out.println("Digite o valor do Eixo X: ");
        double y = leitor.nextDouble();
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

    }

}
