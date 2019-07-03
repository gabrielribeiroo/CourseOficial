/*
 Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
 */
package course.exercicio2.condicional;

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
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int n = leitor.nextInt();
        
        if(n % 2 ==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        } 
            
    }
    
}
