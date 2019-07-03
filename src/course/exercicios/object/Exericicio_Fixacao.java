/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.exercicios.object;

import entidades.Banco;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exericicio_Fixacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Número da conta: ");
        int numero = leitor.nextInt();
        System.out.println("Proprietário da Conta: ");
        leitor.nextLine();
        String proprietario = leitor.nextLine();
               
        System.out.println("Possui um deposito inicial (y/n)? ");
        char c = leitor.next().charAt(0);
        Banco banco = new Banco(numero, proprietario);
        if (c == 'y') {
            System.out.println("Digite o valor do deposito inicial: ");
            double depositoInicial = leitor.nextDouble();
            banco.setValorConta(depositoInicial);
        } else {
            banco.setValorConta(0.00);
        }

        System.out.println("Dados da Conta: ");
        System.out.printf("Número da conta: %d, Proprietário: %s, Valor em Conta: %.2f%n", banco.getAgencia(), banco.getProprietario(), banco.getValorConta());
        
        System.out.println("Entre com o Valor de deposito: ");
        double deposito = leitor.nextDouble();
        banco.deposito(deposito);
        
        System.out.println("Dados da conta Atualizados:");
        System.out.printf("Número da conta: %d, Proprietário: %s, Valor em Conta: %.2f%n", banco.getAgencia(), banco.getProprietario(), banco.getValorConta());
        
        System.out.println("Entre com os dados de Saque: ");
        double saque = leitor.nextDouble();
        banco.saque(saque);
        
        System.out.println("Dados da conta Atualizados:");
        System.out.printf("Número da conta: %d, Proprietário: %s, Valor em Conta: %.2f%n", banco.getAgencia(), banco.getProprietario(), banco.getValorConta());
        
        
        
    }

}
