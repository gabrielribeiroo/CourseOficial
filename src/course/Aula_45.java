/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import entidades.Triangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Aula_45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of Triangle X:");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();

        System.out.println("Enter the measures of Triangle Y:");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triagle X area: %.4f%n", areaX);
        System.out.printf("Triagle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area : X");
        } else {
            System.out.println("Larger area : Y");
        }

    }

}
