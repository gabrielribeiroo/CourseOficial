/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
package course.exercicio4.For;

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
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de vezes que vão entrar dados: ");
        int vezes = leitor.nextInt();
        int in = 0, out = 0;
        for (int i = 0; i < vezes; i++) {
            System.out.println("Digite um numero: ");
            int num = leitor.nextInt();
            if(num >=10 && num <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }

}
