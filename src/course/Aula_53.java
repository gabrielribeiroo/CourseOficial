/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import entidades.Dollar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Aula_53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do Dollar?");
        double dolar = leitor.nextDouble();
        System.out.println("O Quanto deseja comprar?");
        double comprar = leitor.nextDouble();

        System.out.printf("Valor a ser pago em REAIS: %.2f%n", Dollar.valorPago(dolar, comprar));
    }

}
