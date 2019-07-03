/*
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
package course.exercicio2.condicional;

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
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a hora de inicio do jogo: ");
        int horaInicio = leitor.nextInt();
        System.out.println("Digite a hora de inicio do jogo: ");
        int horaTermino = leitor.nextInt();
        int horas = 24;
        if (!(horaInicio > 24 || horaTermino > 24)) {
            if (horaInicio > horaTermino) {
                int calcHoras = (horas - horaInicio) + horaTermino;
                System.out.println("O JOGO DUROU " + calcHoras + " HORA(S)");
            } else if (horaInicio == 0 && horaTermino == 0) {
                System.out.println("O JOGO DUROU 24 HORA(S)");
            } else if (horaInicio < horaTermino) {
                int calcHoras = ((horas - horaInicio) + horaTermino) - horas;
                System.out.println("O JOGO DUROU " + calcHoras + " HORA(S)");
            }
        } else {
            System.out.println("Nao permitido a entrada de mais de 24 horas");
        }
    }

}
