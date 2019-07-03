/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.exercicios.object;

import entidades.Rectangle;
import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Inserir a altura e largura do Retangulo:");
        r.altura = leitor.nextDouble();
        r.largura = leitor.nextDouble();
        System.out.printf("AREA = %.2f%n",r.Area());
        System.out.printf("PERIMETRO = %.2f%n",r.Perimetro());
        System.out.printf("DIAGONAL = %.2f%n",r.Diagonal());

    }

}
