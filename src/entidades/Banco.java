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
public class Banco {
    private int agencia;
    private String proprietario;
    private double valorConta;
    
    public Banco(int agencia, String proprietario, double ValorConta){
        this.agencia = agencia;
        this.proprietario = proprietario;
        this.valorConta = ValorConta;
    }

public Banco(int agencia, String proprietario){
        this.agencia = agencia;
        this.proprietario = proprietario;
        this.valorConta = 0.00;
        
    }

    public void deposito(double valor){
        this.setValorConta(this.getValorConta() + valor);
    }
    
    public void saque (double valor){
        this.setValorConta(this.getValorConta() - valor - 5);
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the proprietario
     */
    public String getProprietario() {
        return proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * @return the valorConta
     */
    public double getValorConta() {
        return valorConta;
    }

    /**
     * @param valorConta the valorConta to set
     */
    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }
}
