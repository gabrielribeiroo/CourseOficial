/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.execicio.ArrayLista;

import entidades.Empregados;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exericicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos empregados serão registrados?");
        int emp = leitor.nextInt();
        ArrayList<Empregados> lista = new ArrayList<>();
        for (int i = 0; i < emp; i++) {
            System.out.println("Empregado #" + (i + 1) + ": ");
            System.out.println("ID: ");
            int id = leitor.nextInt();
            System.out.println("Nome: ");
            leitor.nextLine();
            String nome = leitor.nextLine();
            System.out.println("Salario: ");
            double salario = leitor.nextDouble();
            Empregados e = new Empregados(id, nome, salario);
            lista.add(e);
        }
        System.out.println("Entre com o ID do Empregado que receberá um aumento: ");
        int idAumento = leitor.nextInt();
        for (Empregados emprega : lista) {
            if (idAumento == emprega.getID()) {
                System.out.println("Entre com a porcentagem de aumento: ");
                double porcentagem = leitor.nextDouble();
                emprega.aumento(porcentagem);
            }
        }
        System.out.println("Lista de empregados: ");
        for (Empregados emprega : lista) {
            System.out.println(emprega.getID() + ", " + emprega.getNome() + ", " + emprega.getSalario() + "\n");
        }
    }

}
