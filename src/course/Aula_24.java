/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Aula_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = leitor.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = leitor.nextInt();
        
        if(n1 > n2 && n1 > n3){
            System.out.println("MAIOR= "+ n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.println("MAIOR= "+n2);
        }else{
            System.out.println("MAIOR= "+ n3);
        }
        
    }
    
}
