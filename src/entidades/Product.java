/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author cn3
 */
public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() {
        return quantity * price;
    }

    public void AddProducts(int qtd) {
        this.quantity = quantity + qtd;
    }

    public void RemoveProducts(int qtd) {
        this.quantity = quantity - qtd ;
    }
    
    
}
