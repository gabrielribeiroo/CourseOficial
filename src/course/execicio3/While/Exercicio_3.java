/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
package course.execicio3.While;

import java.util.Scanner;

/**
 *
 * @author cn3
 */
public class Exercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int combustivel = 0, alcool = 0, gasolina = 0, diesel = 0;
        while (combustivel != 4) {
            System.out.println("1 - Álcool \n2 - Gasolina \n3 - Diesel \n4 - Fim");
            combustivel = leitor.nextInt();
            if (combustivel == 1) {
                alcool = alcool + 1;
            } else if (combustivel == 2) {
                gasolina = gasolina + 1;
            } else if (combustivel == 3) {
                diesel = diesel + 1;
            }
        }
        if (combustivel == 4) {
            System.out.println("MUITO OBRIGADO");
            System.out.println("Álcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);
        }
    }

}
