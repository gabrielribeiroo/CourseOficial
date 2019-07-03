/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.Locale;

/**
 *
 * @author cn3
 */
public class Aula_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double preco = 34.5;
        double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }

}
