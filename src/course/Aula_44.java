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
public class Aula_44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        System.out.println("Enter the measures of Triangle X:");
        xA = leitor.nextDouble();
        xB = leitor.nextDouble();
        xC = leitor.nextDouble();
        System.out.println("Enter the measures of Triangle Y:");
        yA = leitor.nextDouble();
        yB = leitor.nextDouble();
        yC = leitor.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triagle X area: %.4f%n", areaX);
        System.out.printf("Triagle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area : X");
        } else {
            System.out.println("Larger area : Y");
        }
    }

}
