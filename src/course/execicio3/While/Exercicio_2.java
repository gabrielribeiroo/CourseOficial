/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */
package course.execicio3.While;

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
        int x, y;
        x = CoordenadaX();
        y = CoordenadaY();
        while (x != 0 && y != 0) {
            Quadrante(x, y);
            x = CoordenadaX();
            y = CoordenadaY();
        }

    }

    static int CoordenadaX() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Valor de X: ");
        int x = leitor.nextInt();
        return x;
    }

    static int CoordenadaY() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Valor de Y: ");
        int y = leitor.nextInt();
        return y;
    }

    static void Quadrante(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("Primeiro");
        } else if (x < 0 && y > 0) {
            System.out.println("Segundo");
        } else if (x < 0 && y < 0) {
            System.out.println("Terceiro");
        } else {
            System.out.println("Quarto");
        }
    }

}
