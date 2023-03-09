# java-
Repositório das aulas de Orientação a Objetos
package br.com.aula01;
import java.util.Scanner;
public class multiplicacao {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Informe o terceiro número: ");
        int numero3 = entrada.nextInt();

        int multiplicacao = numero1 * numero2 * numero3;

        System.out.printf("A multiplicação de %d\n", numero1);
        System.out.printf("Com o número %d\n", numero2);
        System.out.printf("Multiplicado com o número %d\n", numero3);
        System.out.printf("A multiplicação dos valores é %d\n", multiplicacao);


    }

}
