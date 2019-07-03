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

public class Dollar {
    public static final double IOF = 0.06;
    
    public static double valorPago(double dolar, double valor){
        double calc = dolar * valor;
        calc += calc * IOF;
        return calc;
    }
}
