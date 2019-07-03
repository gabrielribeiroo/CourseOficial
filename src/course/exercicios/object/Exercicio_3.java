/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.exercicios.object;

import entidades.Aluno;
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
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Digite o nome:");
        aluno.nome = leitor.nextLine();
        System.out.println("Digite as 3 notas dos trimestres: ");
        aluno.n1 = leitor.nextDouble();
        aluno.n2 = leitor.nextDouble();
        aluno.n3 = leitor.nextDouble();
        
        System.out.printf("Nota Final: %.2f%n",aluno.notaFinal());
        
        if(aluno.notaFinal() > 60.0){
            System.out.println("PASSOU");
        }else{
            System.out.println("REPROVOU");
            System.out.printf("Faltou %.2f Pontos", aluno.pontos(aluno.notaFinal()));
        }
    }
    
}
