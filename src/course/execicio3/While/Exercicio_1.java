/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
package course.execicio3.While;

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
        Scanner leitor = new Scanner(System.in);
        int senha = 0;
        while (senha != 2002) {
            System.out.println("Digite a senha: ");
            senha = leitor.nextInt();
            if(senha != 2002){
                System.out.println("Senha Invalida");
            }else{
                System.out.println("Acesso Permitido");
            }
        }
    }

}
