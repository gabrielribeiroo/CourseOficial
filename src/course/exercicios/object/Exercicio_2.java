/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.exercicios.object;

import entidades.Employee;
import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        Employee emp = new Employee();
        System.out.println("Name: ");
        emp.name = leitor.next();
        System.out.println("Gross Salary: ");
        emp.GrossSalary = leitor.nextDouble();
        System.out.println("Tax: ");
        emp.tax = leitor.nextDouble();
        
        System.out.printf("Employee: %s,  %.2f%n",emp.name,emp.NetSalary());
        System.out.println("Which percentage to encrease salary?");
        double per = leitor.nextDouble();
        emp.IncreaseSalary(per);
        System.out.printf("Employee: %s,  %.2f%n",emp.name,emp.NetSalary());
        
    }
    
}
