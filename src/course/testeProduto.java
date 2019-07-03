/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import entidades.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class testeProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner (System.in);
        Product p = new Product();
        
        
        System.out.println("Enter product data:");
        System.out.println("Name:");
        p.name = leitor.next();
        System.out.println("Price: ");
        p.price = leitor.nextDouble();
        System.out.println("Quantity: ");
        p.quantity = leitor.nextInt();
        
        System.out.println("Product Data: " + p.name + ", $ " + p.price + ", " + p.quantity + " Units, Total: $ " + p.TotalValueInStock());
        
        System.out.println("Enter the number of products to be added in stock: ");
        int qtd = leitor.nextInt();
        p.AddProducts(qtd);
       
        System.out.println("Product Data: " + p.name + ", $ " + p.price + ", " + p.quantity + " Units, Total: $ " + p.TotalValueInStock());
        
        System.out.println("Enter the number of products to be removed from stock: ");
        int qtd2 = leitor.nextInt();
        p.RemoveProducts(qtd2);
        
        System.out.println("Product Data: " + p.name + ", $ " + p.price + ", " + p.quantity + " Units, Total: $ " + p.TotalValueInStock());
    }
    
}
