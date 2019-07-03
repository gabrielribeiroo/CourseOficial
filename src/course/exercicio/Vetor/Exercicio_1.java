/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.exercicio.Vetor;

import entidades.Aluguel;
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
        System.out.println("Quantos quartos serão alugados?");
        int quartos = leitor.nextInt();

        Aluguel[] vetor = new Aluguel[10];
        if (quartos < 10) {
            for (int i = 0; i < quartos; i++) {
                leitor.nextLine();
                System.out.println("Nome: ");
                String nome = leitor.nextLine();
                System.out.println("Email: ");
                String email = leitor.next();
                System.out.println("Quarto: ");
                int quar = leitor.nextInt();
                if (quar < 10) {
                    vetor[i] = new Aluguel(quar, nome, email);
                }
            }
        }

        for (int i = 0; i < quartos; i++) {
            System.out.println("Quartos Alugados:\n"
                    + vetor[i].getRoom() + ": "
                    + vetor[i].getName() + ", "
                    + vetor[i].getEmail());

        }
    }

}
