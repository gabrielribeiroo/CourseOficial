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
public class Aula_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        System.out.println("Enter your full name: ");
        String name = leitor.nextLine();
        System.out.println("How many bedrooms are there in your house?");
        int bedrooms = leitor.nextInt();
        System.out.println("Enter product price:");
        double price = leitor.nextDouble();
        System.out.println("Enter your last name, age and height (same line):");
        String lastName = leitor.next();
        int age = leitor.nextInt();
        double height = leitor.nextDouble();
        
        
        System.out.println(name);
        System.out.println(bedrooms);
        System.out.println(price);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(height);
        
        leitor.close();
    }
    
}
